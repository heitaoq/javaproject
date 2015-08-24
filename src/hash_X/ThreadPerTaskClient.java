package hash_X;

import java.io.IOException;
import java.net.Socket;

/**
 * Simulation of multiple clients.
 */

class MultiClient {
  void sim() {
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Socket socket = new Socket("127.0.0.1", 80);
        } catch (Exception e) {e.getMessage();}
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Socket socket = new Socket("127.0.0.1", 80);
        } catch (Exception e) {e.getMessage();}
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Socket socket = new Socket("127.0.0.1", 80);
        } catch (Exception e) {e.getMessage();}
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Socket socket = new Socket("127.0.0.1", 80);
        } catch (Exception e) {e.getMessage();}
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Socket socket = new Socket("127.0.0.1", 80);
        } catch (Exception e) {e.getMessage();}
      }
    }).start();
  }
}

public class ThreadPerTaskClient {
  public static void main(String[] args) throws IOException{
    MultiClient multiClient = new MultiClient();
    multiClient.sim();
  }
}
