package src.BasicJava;

import java.util.ArrayList;

/**
 * Created by minglei on 2015/11/16.
 */
public class TestReference {
  public static void main(String[] args) {
    Object a = new Object();
    ArrayList arrayList = new ArrayList();
    a = arrayList;
    System.gc();
  }
}
