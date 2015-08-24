package hash_X;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * For every request, start a new thread in Web Server.
 */

public class ThreadPerTaskServer {

  public static void main(String[] args) throws IOException {
    ServerSocket socket = new ServerSocket(80);
    while (true) {
      final Socket conn = socket.accept();
      new Thread(new Runnable() {
        @Override
        public void run() {
          new ThreadSafety_SumNumOfClient().handleAndReturnMax_Number_Customer(conn);
        }
      }).start();
    }
  }
}
