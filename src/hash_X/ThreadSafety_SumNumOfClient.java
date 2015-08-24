package hash_X;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * WebServer for serialization
 */
public class ThreadSafety_SumNumOfClient {

  /**
   * method 1. Count the number of clients connection.
   * This method need thread safety.
   */
  static AtomicLong i = new AtomicLong(1);
  void handleRequest(Socket socket) {
    System.out.println("Client's number is =  " + i.getAndIncrement());
  }

  /**
   * Get the max number of Customer.
   * This method need thread safety.
   */
  static Integer j = 0;
  int max = 0;
  List<Integer> list = new ArrayList<Integer>(20); // number of clients.
  void handleAndReturnMax_Number_Customer(Socket socket) {
    synchronized(j) {
      j++;
      list.add(j);
    }
  }

  public void OutputMaxNumberOfClientAccess() {
    for (Integer integer : list) {
      if (integer > max)
        max = integer;
    }
    System.out.println("We have " + max + " customer access now.");
  }

}