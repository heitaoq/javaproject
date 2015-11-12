package src;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UseReentrantLockImpBlockQueue<T> {

  private LinkedList<T> queue = new LinkedList<T>();
  private int capacity;
  private Lock lock = new ReentrantLock();
  private Condition notFull = lock.newCondition();
  private Condition notEmpty = lock.newCondition();

  public UseReentrantLockImpBlockQueue(int capacity) {
    this.capacity = capacity;
  }

  public void put(T element) throws InterruptedException {
    lock.lock();
    System.out.println(Thread.currentThread().getName() + " put element = " + element);
    try {
      while (queue.size() == capacity) {
        System.out.println("await begin");
        notFull.await();
        System.out.println("await end");
      }
      queue.add(element);
      notEmpty.signalAll();
    } finally {
      lock.unlock();
    }
  }

  public T take() throws InterruptedException {
    lock.lock();
    System.out.println("take thread " + Thread.currentThread().getName());
    try {
      while (queue.isEmpty()) {
        System.out.println("await begin");
        notEmpty.await();
        System.out.println("await end");
      }
      T item = queue.remove();
      notFull.signalAll();
      System.out.println("take element = " + item);
      return item;
    } finally {
      lock.unlock();
    }
  }

  public void Output() {
//    while (queue.iterator().hasNext()) {
//      System.out.println(" Remain element = " + queue.iterator().next());
//    }
    lock.lock();
    System.out.println();
    Iterator iterator = queue.iterator();
    while (iterator.hasNext()) {
      System.out.println("Remain element = " + iterator.next());
    }
    lock.unlock();
  }

}
