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
    ByteBuffer byteBuffer = ByteBuffer.allocate(330);
    int posisss = byteBuffer.position();
    int limitsss = byteBuffer.limit();

    while (fileChannel.read(byteBuffer) > 0) {
      int posis = byteBuffer.position();
      int limitss = byteBuffer.limit();
      byteBuffer.flip();
      int limits = byteBuffer.limit();
      while (byteBuffer.hasRemaining()) {
        int posi = byteBuffer.position();
        int capa = byteBuffer.capacity();
        /**
         * A buffer's limit is the index of the first element that should not be read or written.
         * limit 就是实际存储的多少字节数
         */
        int limit = byteBuffer.limit();
        System.out.print((char)byteBuffer.get());
      } // while end
      byteBuffer.clear(); // 当在 position 和 limit 之间没有元素的时候就要清除缓冲区了
    }
    file.close();
  }
}
