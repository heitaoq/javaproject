package src.NIO;

import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/**
 * Created by mingleiz on 10/24/2015.
 */
public class TestFileChannel {
  public static void main(String[] args) throws Exception{
    FileInputStream fis = new FileInputStream("C:\\Users\\mingleiz\\flatbuffer.txt");
    FileChannel fileChannel = fis.getChannel();
    long sizeFile = fileChannel.size(); // the size of file

  }
}
