package src.Algorithms1;
/**
 * Java�Ļ������������Լ���װ��
 * @author Administrator
 *
 */
public class BasicDS {
	public static void main(String[] args) {
		int i =1; //Integer
		float f = (float)1.0; //Float float f = 1.0f;JavaĬ����Double������Ҫǿ��ת����2�ַ�ʽ
		double d = 1.0; //Double
		boolean b = false; //Boolean
		char c = 'a'; //Character
		long l = 1L; //Long
		byte b_ = (byte)1; //Byte
		short s = (short)1; // Short

		Integer it = Integer.valueOf(i);//�ӻ������͵���װ��  װ��
		i = it.intValue();//�Ӱ�װ�ൽ������	����

		//�Զ�װ��Ͳ��� jdk 1.5 (JDK 5.0)�Ժ���е�
		Integer integer = 1;
		i = integer;
	}
}
