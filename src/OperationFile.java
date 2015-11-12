package src;
import java.io.*;
import java.nio.Buffer;

/**
 * Read a file from disk and put data into a buffer.
 */

public class OperationFile {

  public static void main(String[] args) {
    File file = new File(args[0]);
    byte[] data = new byte[Integer.parseInt(args[1])];
    InputStream inputStream;
    try {
      inputStream = new BufferedInputStream(new FileInputStream(file));
      while (inputStream.read(data) != -1) {

      }
    } catch (Exception ex) {
      ex.getMessage();
    }
  }

}
