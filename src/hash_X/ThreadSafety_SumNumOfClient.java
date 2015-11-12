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
  public void handleAndReturnMax_Number_Customer(Socket socket) {
    synchronized(j) {
      j++;
    }
    System.out.println("We have " + j + " customer access now.");

  }

  // handleAndReturnMax_Number_Customer may have problem, if below situation happen.
  public void fun(){
    j--;
  }

}