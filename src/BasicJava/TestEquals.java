package src.BasicJava;

class Student {
  public String name;
  private int age;
  private int number;

  public Student(String name, int age, int number) {
    this.name = name;
    this.age = age;
    this.number = number;
  }

  /**
   *
   * equals 用于比较  ===对象的内容===  是否相等
   *
   * 默认情况下，equals方法都是调用 Object 类的 equals 方法，
   * 而 Object的方法是用来判断内存地址引用是不是同一个地址。也
   * 就是说是不是指向同一个heap里面的对象。
   *
   * 如果自己定义的类中覆盖了 equals 方法，那么就需要根据具体的
   * 代码来确定 equals方法的作用了，覆盖后一般都是根据对象的内容
   * 来判断对象是否相等。
   *
   * 剩下的部分请看如下网址写的：
   * http://www.360doc.com/content/14/0527/09/15113968_381327452.shtml
   *
   * 简单概述网站后面关于 hashcode 的理解
   * 1 ： hashcode 方法只有在集合中用到
   * 2 ： 当覆盖了 equals方法，比较对象是否相等(内容)将通过覆盖后的 equals方法进行比较
   * 3 ： 将对象放入集合中时，首先要判断对象的 hashcode值与集合中任一元素的hashcode是否
   * 相等，如果不相等，那么直接放入集合中。 如果hashcode相等(碰撞)，然后再通过 equals方法
   * 判断要放入对象与集合中的任一一个对象是否相等，如果equals判断不相等，直接将元素放入集合中，
   * 否则不放入。
   *
   * hashcode决定放入哪一个桶中，然后在一个桶中的数据都是发生碰撞的
   * 当决定放在同一个桶中的时候，然后再去判断 equals是否相同，如果相
   * 等，那么数据是存在的。也就不需要再放入，如果不同，那么就放入进去。
   *
   */
  @Override
  public boolean equals(Object student) {
    Student s1 = (Student)student;
    if (s1.name.equals(name) && s1.age == this.age && s1.number == this.number) {
      return true;
    }
    return false;
  }
}

public class TestEquals {
  public static void main(String[] args) {
    Student s1 = new Student("zhangsan", 15, 14);
    Student s2 = new Student("zhangsan", 15, 13);
    if (s1.equals(s2)) {
      System.out.print(" == ");
    }
  }
}
