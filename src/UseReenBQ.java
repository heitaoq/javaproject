
public class UseReenBQ {

  static UseReentrantLockImpBlockQueue queue = new UseReentrantLockImpBlockQueue(10);

  static void useReenBQ() {

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          queue.put(1);
          queue.put(2);
          queue.put(3);
          queue.put(4);
        } catch (InterruptedException e) {
          e.getMessage();
        }
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          queue.put(5);
          queue.put(6);
        } catch (InterruptedException e) {
          e.getMessage();
        }
      }
    });

    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          queue.put(7);
          queue.put(8);
        } catch (InterruptedException e) {
          e.getMessage();
        }
      }
    });

    Thread thread4 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          for (int i = 0; i < 7; i++) {
            queue.take();
          }
        } catch (InterruptedException e) {
          e.getMessage();
        }
      }
    });
    thread1.setName("thread1");
    thread2.setName("thread2");
    thread3.setName("thread3");
    thread4.setName("thread4");

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    try {
      thread2.join();
      thread3.join();
      thread1.join();
      thread4.join();
    } catch (InterruptedException e) {
      e.getMessage();
    }

  }

  public static void main(String[] args) {
    UseReenBQ.useReenBQ();
    queue.Output();
  }
}
