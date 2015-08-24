package hash_X;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * A web server based on ThreadPool.
 */
public class TaskExecutionServer {
  private static final int NTHREADS = 5;
  private static final Executor exec = Executors.newFixedThreadPool(NTHREADS);

  public static void main(String[] args) throws IOException{
    ServerSocket socket = new ServerSocket(80);

    while (true) {
      final Socket conn = socket.accept();
      Runnable task = new Runnable() {
        @Override
        public void run() {
          new ThreadSafety_SumNumOfClient().handleRequest(conn);
        }
      };
      exec.execute(task);
    }

  }
}
