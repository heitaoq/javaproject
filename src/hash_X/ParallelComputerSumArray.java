//package hash_X;
//
//import java.util.concurrent.Callable;
//
///**
// * Created by mingleiz on 8/24/2015.
// */
//public class ParallelComputerSumArray implements Callable<Long>{
//
//  private int[] number;
//  /**
//   * Computes a result, or throws an exception if unable to do so.
//   *
//   * @return computed result
//   * @throws Exception if unable to compute a result
//   */
//  @Override
//  public Long call() throws Exception {
//    Long sum = 0L;
//    for (int i = 0;i<number.length;i++) {
//      sum += sum + number[i];
//    }
//    return sum;
//  }
//
//  public static void main(String[] args) {
//    int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 10, 11 };
//    ParallelComputerSumArray sumArray = new ParallelComputerSumArray();
//
//  }
//}
