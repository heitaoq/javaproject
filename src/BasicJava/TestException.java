package BasicJava;

/**
 * Created by mingleiz on 11/10/2015.
 */
// hack code ??????????????
public class TestException {

  public static int sss(int[] arr) {
    try {
      int a = arr[3] + arr[4];
    } catch (Exception e) {

    }
    int b = 3 + 4;
    System.out.println(b);
    return b;
  }

  public static void main(String[] args) {
    int[] arr = {};
    TestException.sss(arr);
  }
}
