package src.BasicJava;

import java.util.Vector;

/**
 * Created by mingleiz on 8/31/2015.
 */
public class TestVector {

  public static Object getLast(Vector list) {
    int lastIndex = list.size() - 1;
    return list.get(lastIndex);
  }

  public static void deleteLast(Vector list) {
    int lastIndex = list.size() - 1;
  }

  public static void main(String[] args) {
  }
}
