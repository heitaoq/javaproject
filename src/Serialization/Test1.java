package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by mingleiz on 9/9/2015.
 */
public class Test1 {
  public static void main(String[] args) {
    try {
      FileOutputStream f = new FileOutputStream("tmp");
      ObjectOutput s = new ObjectOutputStream(f);
      s.writeObject("1");
//      s.writeObject(new Date());
      s.flush();
    } catch (Exception e) {
      e.getMessage();
    }

  }
}
