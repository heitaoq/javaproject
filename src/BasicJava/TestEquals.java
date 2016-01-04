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
   * equals ���ڱȽ�  ===���������===  �Ƿ����
   *
   * Ĭ������£�equals�������ǵ��� Object ��� equals ������
   * �� Object�ķ����������ж��ڴ��ַ�����ǲ���ͬһ����ַ��Ҳ
   * ����˵�ǲ���ָ��ͬһ��heap����Ķ���
   *
   * ����Լ���������и����� equals ��������ô����Ҫ���ݾ����
   * ������ȷ�� equals�����������ˣ����Ǻ�һ�㶼�Ǹ��ݶ��������
   * ���ж϶����Ƿ���ȡ�
   *
   * ʣ�µĲ����뿴������ַд�ģ�
   * http://www.360doc.com/content/14/0527/09/15113968_381327452.shtml
   *
   * �򵥸�����վ������� hashcode �����
   * 1 �� hashcode ����ֻ���ڼ������õ�
   * 2 �� �������� equals�������Ƚ϶����Ƿ����(����)��ͨ�����Ǻ�� equals�������бȽ�
   * 3 �� ��������뼯����ʱ������Ҫ�ж϶���� hashcodeֵ�뼯������һԪ�ص�hashcode�Ƿ�
   * ��ȣ��������ȣ���ôֱ�ӷ��뼯���С� ���hashcode���(��ײ)��Ȼ����ͨ�� equals����
   * �ж�Ҫ��������뼯���е���һһ�������Ƿ���ȣ����equals�жϲ���ȣ�ֱ�ӽ�Ԫ�ط��뼯���У�
   * ���򲻷��롣
   *
   * hashcode����������һ��Ͱ�У�Ȼ����һ��Ͱ�е����ݶ��Ƿ�����ײ��
   * ����������ͬһ��Ͱ�е�ʱ��Ȼ����ȥ�ж� equals�Ƿ���ͬ�������
   * �ȣ���ô�����Ǵ��ڵġ�Ҳ�Ͳ���Ҫ�ٷ��룬�����ͬ����ô�ͷ����ȥ��
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
