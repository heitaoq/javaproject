package src.BasicJava;

import java.io.UnsupportedEncodingException;

/**
 * Created by mingleiz on 11/6/2015.
 */
public class Test {

  public static String bytesToString(byte[] bytes) {
    String str = "";
    try {
      str = new String(bytes);
    } catch (Exception e) {
      return null;
    }
    return str;
  }

  public static void main(String[] args) throws UnsupportedEncodingException {
    String str = "abc";
//    String st = bytesToString(str.getBytes());
//    System.out.println(st);
  }
}
