package src.NIO;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.channels.*;
import java.nio.channels.spi.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
/**
 * Created by mingleiz on 10/24/2015.
 */
public class TestPath {
  public static void main(String[] args) {
    FileSystem fileSystem = FileSystems.getDefault();
    Path hostsFile = fileSystem.getPath("C:\\Users\\mingleiz\\flatbuffer.txt");
    Path path = fileSystem.getPath("C:\\Users\\mingleiz");

  }
}
