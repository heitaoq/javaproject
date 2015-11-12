package src;
/**
 * Created by mingleiz on 8/20/2015.
 */

class Person {
  public static int age;
  public void setAge(int age_) {
    age = age_;
  }
}
public class TestStaticVal {
  public static void main(String[] args) {
    Person tom = new Person();
    Person jack = new Person();
    tom.setAge(10);
    jack.setAge(20);
    System.out.println(tom.age);
  }
}
