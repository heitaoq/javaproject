package src.Algorithms1;
/**
 * �����Ƕ������黹�ǻ������͵����鶼��չ��Object��
 * equals�������ڼ��һ�������Ƿ��������һ������
 * hashCode���ɶ��󵼳���һ������ֵ
 * hashCode����������Object����,���ÿ��������һ��Ĭ�ϵ�ɢ���룬��ֵΪ����Ĵ洢��ַ
 *
 * @author Administrator
 *
 */
public class equals_hashcode {
	public static void main(String[] args) {
		//�������ڲ��ϱ仯�ģ����Ի���ͬһ����
		Student s1 = new Student("zhangminglei",24,1235678);
		Student s2 = new Student("zhangminglei",25,1235678);
		System.out.println(s1 == s2);// == �Ƚϵ��Ƕ���ĵ�ַ���߻������͵ıȽ�
		/**
		 * 2����ȵĶ���Ҫ�󷵻�2����ȵ�ɢ���룬����ö����Student.equals�Ƚϵ���ѧ����������ѧ
		 * �ţ���ôhashCode��ֻ��Ҫɢ����2���ֶξͿ��ԣ�age�ֶβ���Ҫɢ��
		 * ���x.equals(y)����true,��ôx��hashCode�ͱ�����y��hashCode��ȣ����Ե���дhashCode
		 */
		System.out.println(s1.hashCode() +"\n"+s2.hashCode());
		System.out.println(s1.toString()+"\n"+s2);
		if (s1.equals(s2))
			System.out.println("s1������s2�������");
		else
			System.out.println("s1������s2�������");

		//�ַ���s��t����ͬ��ɢ���룬����Ϊ�ַ�����ɢ�����������ݵ�����
		String s = "OK";
		String t = new String(s);
		System.out.println(s.hashCode() +"\n"+ t.hashCode());

		//�ַ���sb��tb���岻ͬ��ɢ���룬����Ϊ��StringBuilder������û�ж���hashCode����
		//����ɢ��������Object��Ĭ��hashCode���������Ķ���洢��ַ
		StringBuilder sb = new StringBuilder(s);
		StringBuilder tb = new StringBuilder(t);
		System.out.println(sb.hashCode() +"\n"+ tb.hashCode());

	}
}
class Student {
	String name;
	int age;
	int studentNumber;
	public Student(String name, int age,int studentNumber) {
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}
	/**
	 * ����ֵ���ַ�����ʾ
	 * �洦�ɼ�toString��������Ҫԭ����ֻҪ������һ��������+����������Java����ͻ��Զ��ĵ���
	 * toString���Ա������������ַ�������
	 * return "������:" +name.toString() +"  ������:"+Integer.valueOf(age).toString();
	 */
	@Override
	public String toString() {
		return "������:" +name +"������:"+age;
	}

	/**
	 * ������¶�����equals�������ͱ������¶���hashCode�������Ա��û����Խ�������뵽ɢ�б���
	 * Ϊʲô�أ���Ϊ���2��������ȣ���ô����ͬһ������������뵽��ͬ��ɢ�б��л������Դ�˷�
	 */
	@Override
	public boolean equals(Object obj) {
		Student stu = (Student) obj;
		// StringҲ��Ҫ��equals�ж�
		if (stu.name.equals(this.name) && stu.studentNumber == this.studentNumber)
			return true;
		return false;
	}
	/**
	 * ��Ϊequals�Ƚϵ���������ѧ��2���ֶΣ�����hashCodeֻɢ����ѧ����������ѧ��2���ֶ�
	 */
	@Override
	public int hashCode() {
		return name.hashCode() + Integer.valueOf(studentNumber).hashCode();
	}

}
