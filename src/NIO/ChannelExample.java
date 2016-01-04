package src.NIO;

import java.io.File;
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
    FileChannel fileChannel = file.getChannel(); // if you use File, you can not get a FileChannel

    // Once a file channel is opened, obtain the size of the file is called size(), measured in bytes.
    long sizeOfFile = fileChannel.size();
    ByteBuffer byteBuffer = ByteBuffer.allocate(330);
    /**
     * fileChannel.read(byteBuffer)
     */
    while (fileChannel.read(byteBuffer) > 0) {  
      //
      byteBuffer.flip();
      while (byteBuffer.hasRemaining()) {
        /**
         * A buffer's limit is the index of the first element that should not be read or written.
         * limit ����ʵ�ʴ洢�Ķ����ֽ���
         */
        System.out.print((char)byteBuffer.get());
      } // while end, that is mean, position is equals to limit.
      byteBuffer.clear(); // ���� position �� limit ֮��û��Ԫ�ص�ʱ���Ҫ�����������
    }
    file.close();
  }
}
