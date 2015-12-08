package src.scala

import scala.collection.mutable

object IteratorTest extends App{
  val set = new mutable.LinkedHashSet[Any]
  set += "This is a string"
  set += 333
  set += true
  set += main _
  val iter : Iterator[Any] = set.iterator
  while (iter.hasNext) {
    println(iter.next().toString)
  }
}
