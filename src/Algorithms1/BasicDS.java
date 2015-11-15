package src.Algorithms1;
/**
 * Java的基础数据类型以及包装类
 * @author Administrator
 *
 */
public class BasicDS {
	public static void main(String[] args) {
		int i =1; //Integer
		float f = (float)1.0; //Float float f = 1.0f;Java默认是Double，所以要强制转换，2种方式
		double d = 1.0; //Double
		boolean b = false; //Boolean
		char c = 'a'; //Character
		long l = 1L; //Long
		byte b_ = (byte)1; //Byte
		short s = (short)1; // Short

		Integer it = Integer.valueOf(i);//从基础类型到包装类  装箱
		i = it.intValue();//从包装类到基础类	拆箱

		//自动装箱和插箱 jdk 1.5 (JDK 5.0)以后才有的
		Integer integer = 1;
		i = integer;
	}
}
