package src.TestJDK;

import java.util.Comparator;

/**
 * @author Administrator
 *
 */
class Student {

	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student stu = (Student) obj;
		if (stu.name.equals(this.name) && stu.age == this.age)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Name = " + name + "  Age = " + age + "\n";
	}

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
}
/**
 * Comparator是比较用的
 * @author Administrator
 *
 */
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.equals(s2))
			return 0;
		else if (s1.getAge() < s2.getAge())
			return 1;
		else
			return -1;
	}
}
public class ComparatorDemo {
	public static void main(String[] args) {
		Student[] stu =
				{
						new Student("lizi",20),
						new Student("wz",20),
						new Student("zhang",23),
						new Student("hu",24)
				};
		java.util.Arrays.sort(stu, new StudentComparator());
		for (int i = 0;i<stu.length ;i++){
			System.out.println(stu[i]);
		}
	}
}