package src.scala

abstract class AbsIterator {
  type F
  def hashNext : Boolean
  def next : F
}

trait RichIterator extends AbsIterator {
  def foreach(f : F => Unit) {
    while (hashNext) {
      f(next)
    }
  }
}

class StringIterator(s:String) extends AbsIterator {
  private var i = 0
  override type F = Char
  override def next : F = { val ch = s charAt i ; i += 1 ; ch}
  override def hashNext: Boolean = { i < s.length }
}

object StringIteratorTest {
  def main (args: Array[String]) {
    class Iter extends StringIterator(args(0)) with RichIterator
    val iter = new Iter
    iter foreach println
  }
}
