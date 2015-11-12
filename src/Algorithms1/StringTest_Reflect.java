package src.Algorithms1;

import java.lang.reflect.Field;

/**
 * String���ǲ��ɱ��࣬Ϊʲô����Ĳ��ɱ���
 * http://www.2cto.com/kf/201401/272974.html
 *
 */
public class StringTest_Reflect {
	public static void main(String[] args) throws Exception{
		/**
		 * ��toLowerCase������ʵ�֣����շ��ص���һ���µ��ַ���������ԭ����String�����ǲ��ɱ��
		 * return new String(result, 0, len + resultOffset);
		 * ��Ҳ����Ϊʲô��replace�� substring��toLowerCase�ȷ��������ڷ���ֵ��ԭ��
		 */
		String s = "abcDEF";
		String newS = s.toLowerCase();
		System.out.println("s = " + s + "\n"+newS);
		
		/**
		 * private final char value[];
		 * �����Ŀ�֪String�ĳ�Ա������private final �ģ�Ҳ���ǳ�ʼ��֮�󲻿ɸı䡣
		 * ��ô���⼸����Ա�У� value�Ƚ����⣬��Ϊ����һ�����ñ����������������Ķ���
		 * value��final���εģ�Ҳ����˵final������ָ���������������ô���ܸı�valueָ��������� 
		 * ���罫�����е�ĳ��λ���ϵ��ַ���Ϊ�»��ߡ�_���� �����������Լ�д����ͨ�����в��ܹ���������Ϊ
		 * ���Ǹ������ܹ����ʵ����value���ã�������ͨ���������ȥ�޸����顣 ��ô��ʲô��ʽ���Է���˽�г�Ա�أ�
		 *  û���÷��䣬 ���Է����String�����е�value���ԣ� �����ı�ͨ����õ�value���øı�����Ľṹ��������ʵ�����룺
		 */
		String str = "Hello World";
		System.out.println("str = " + str); //Hello World
		
		//��ȡString���е�value�ֶ�
	    Field valueFieldOfString = String.class.getDeclaredField("value");
	    //�ı�value���Եķ���Ȩ��
	    valueFieldOfString.setAccessible(true);
	    //��ȡs�����ϵ�value���Ե�ֵ
	    char[] value = (char[]) valueFieldOfString.get(str);
	    //�ı�value�����õ������еĵ�5���ַ�
	    value[5] = '_';
	    System.out.println("str = " + str);
	    
	    /**
	     * ����������У�sʼ�����õ�ͬһ��String���󣬵����ٷ���ǰ�����String�������˱仯��
	     * Ҳ����˵��ͨ�������ǿ����޸���ν�ġ����ɱ䡱�����
	     */
	}
}








