package src.BasicJava;

/**
 * Created by minglei on 2015/11/17.
 */

class Stu {
  public String name;
  private int age;
  private int number;

  public Stu(String name, int age, int number) {
    this.name = name;
    this.age = age;
    this.number = number;
  }

  @Override
  public int hashCode() {
    return age + number;
  }
}

