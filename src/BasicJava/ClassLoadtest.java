package BasicJava;

/**
 * Created by mingleiz on 9/6/2015.
 */
class LinkedList {
  void print() {
    System.out.println("Hello LinkedList");
  }
}
public class ClassLoadtest {
  public static void main(String[] args) {
    BasicJava.LinkedList list = new BasicJava.LinkedList();
    list.print();
  }
}
