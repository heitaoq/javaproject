import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class GenerateServerFileOnHDFS {

  private static AtomicLong num = new AtomicLong(); // how many file you will put
  private static int numThread;
  private static String command =
      "hadoop fs -put /tmp/ec-isa.img /abc/" + num + ".img";

  public GenerateServerFileOnHDFS() {
  }

  public static synchronized void generateServerFileOnLocalDisk() {
    try {
      Runtime.getRuntime().exec(command).waitFor();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    numThread = Integer.parseInt(args[0]);
    ExecutorService exec = Executors.newFixedThreadPool(numThread);
    while ( num.getAndIncrement() != numThread) {
      Runnable task = new Runnable() {
        @Override
        public void run() {
          GenerateServerFileOnHDFS.generateServerFileOnLocalDisk();
        }
      };
      System.out.println("num = " + num);
      exec.execute(task);
    }
    exec.shutdown();
  }

}
