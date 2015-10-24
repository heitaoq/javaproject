package src.BasicJava;

/**
 * Created by mingleiz on 9/8/2015.
 */
public class TestReflect {

  private final static String LOCATION = "java.lang.reflect.Type";

  public static void main(String[] args) {
    try {
      Class clazz = Class.forName(LOCATION);
      System.out.println(clazz.getClassLoader());
    } catch (ClassNotFoundException c) {
      c.getMessage();
    }

  }
}
