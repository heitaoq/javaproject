package src.NIO;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Reference:
 * http://javapapers.com/java/java-nio-channel/
 */
public class ChannelExample {
  public static void main(String[] args) throws Exception{
    RandomAccessFile file = new RandomAccessFile("C:\\Users\\mingleiz\\flatbuffer.txt", "r");
    FileChannel fileChannel = file.getChannel();
    ByteBuffer byteBuffer = ByteBuffer.allocate(512);
    while (fileChannel.read(byteBuffer) > 0) {
      byteBuffer.flip();
      while (byteBuffer.hasRemaining()) {
        int posi = byteBuffer.position();
        int capa = byteBuffer.capacity();
        /**
         * A buffer's limit is the index of the first element that should not be read or written.
         * limit 就是实际存储的多少字节数
         */
        int limit = byteBuffer.limit();
        System.out.print((char)byteBuffer.get());
      }
      byteBuffer.clear();
    }
    file.close();
  }
}
