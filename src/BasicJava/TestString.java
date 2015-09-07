package BasicJava;

import java.util.concurrent.atomic.AtomicLong;

/**
 * A good question.
 */
public class TestString {
  public static void main(String[] args) {
    int i = 5;
    String str = "a" + i;
    System.out.println(str);
    i = 10;
    System.out.println(str);
  }
}
