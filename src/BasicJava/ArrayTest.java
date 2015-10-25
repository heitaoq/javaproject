package src.BasicJava;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by mingleiz on 9/20/2015.
 */
public class ArrayTest {
  void test() {
    String[] str = {"1", "2"};
    String[][] str_ = {{"1","2"},{}};
    String[][][] arrayName = {{},{},{}};
  }

  static void testArrayList() {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    int size = arrayList.size(); // return the num of number in the list.
  }

  static void testFileStream() throws Exception{
    FileInputStream ins = new FileInputStream(new File("C:\\Users\\mingleiz\\flatbuffer.txt"));
    byte[] bytes = new byte[ins.available()];
    ins.read(bytes);
    FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\mingleiz\\another.txt"));
    fos.write(bytes);
    ins.close();
    fos.close();
  }

  /**
   * ByteArrayInputStream is an implementation of an input stream that uses a byte array
   * as the source.
   *
   * ByteArrayOutputStream is an implementation of an output stream that uses a byte array
   * as the destination.
   *
   * @throws Exception
   */
  static void testByteStream() throws Exception {
    String str = "gaolun is a sb";
    byte[] bytes = str.getBytes();
    ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
    int c;
    while ((c = inputStream.read()) != -1) {
      System.out.print((char) c);
    }

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    String s = "hello, gaolun , are you a sb ?";
    byte[] bytes1 = s.getBytes();
    outputStream.write(bytes1); // 把 byte1 内容写到 output stream里面去
    OutputStream outputStream1 = new FileOutputStream("test.txt");
    outputStream.writeTo(outputStream1);
  }

  public static void main(String[] args) throws Exception{
//    testArrayList();
//      testFileStream();
        testByteStream();
  }
}
