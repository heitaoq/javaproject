package src.scala

/**
 * Created by hash-X on 2015/12/8.
 */
trait Similarity {
  def isSimilar(x:Any) : Boolean
  def isNotSimilar(x:Any) : Boolean = !isSimilar(x)
}

class Point(xc:Int, yc:Int) extends Similarity {
  var x : Int = xc
  var y : Int = yc
  override def isSimilar(obj: Any): Boolean = {
    obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x
  }
}

object TraitsTest extends App {
  val p1 = new Point(2, 3)
  val p2 = new Point(2, 4)
  val p3 = new Point(2, 3)
  println(p1.isNotSimilar(p2))
  println(p1.isNotSimilar(p3))
  println(p1.isNotSimilar(2))
}

