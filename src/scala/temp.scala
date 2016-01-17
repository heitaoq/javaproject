package com.ctrip.ml.toolimpl

import com.ctrip.ml.mlib.LinearRegressionModel
import org.apache.spark.sql.DataFrame
import scala.collection.mutable
import org.apache.spark.sql.functions._

/**
  * Created by huang_xw on 2016/1/15.
  * huang_xw@ctrip.com
  */
class MissingImputation extends Serializable {

  val predictX: (Double, Double, Double) => Double = (y: Double, a: Double, b: Double) => (y - a) / b

  def imputation(source: DataFrame, modelMap: mutable.HashMap[(String, String), LinearRegressionModel]) = {

    val iterator = modelMap.keysIterator
    var temp = source
    while (iterator.hasNext) {
      val keyValue = iterator.next()
      val missValueImp: (Double, Double) => Double = (arg1: Double, arg2: Double) =>
        if (arg1.hashCode() != 0 && arg2.hashCode() == 0) {
          predictX(arg1, modelMap.get((keyValue._1, keyValue._2)).get.a, modelMap.get((keyValue._1, keyValue._2)).get.b)
        }
        else {
          arg2
        }
      val sqlUDF = udf(missValueImp)
      temp = temp.withColumn(keyValue._2 + "_im", sqlUDF(source(keyValue._1), source(keyValue._2)))
    } // while end
    temp.show()
  }

}
