package src.scala

/**
  * Created by root on 15-12-5.
  */
object QuickSort {

  def sort(xs:Array[Int]):Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
//      Array.concat(
//        sort(xs filter( x => pivot > x )),
//        xs filter( x => pivot == x ),
//        sort(xs filter( x => pivot < x )))

      // method two
      Array.concat(sort(xs filter( pivot > )), xs filter(  pivot == ), sort(xs filter( pivot < )))
    }
  }

  def main (args: Array[String]) {
    val arr = Array(8,1,56,11,34,0,7)
    for (i <- 0 to arr.length - 1)
      print(sort(arr)(i) + " ")
  }

}
