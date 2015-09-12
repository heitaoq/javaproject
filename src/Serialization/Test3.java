package Serialization;

import java.io.Serializable;

/**
 * Created by mingleiz on 9/12/2015.
 */
public class Test3 implements Serializable {
  private static final long serialVersionUID = -5809782578272943L;
  public String name;
  private int age;
  public String sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
