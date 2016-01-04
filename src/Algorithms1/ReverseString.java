package src.Algorithms1;

import java.util.Stack;

/**
 *
 *  1����β����
 *	2���ݹ����
 *	3��ͨ��ջ
 *	4��ͨ���ѣ�����ѿ���ʵ���ַ����������ȼ���
 *	5���ṩ�õ�API������Java�����StringBuilder����StringBuffer
 *
 * @author Administrator
 *
 */
public class ReverseString {

	/**
	 * �Ȱ�str�洢��һ���ַ��������棬Ȼ��Ѵ��ַ���������,�����˼���ȡ���ǡ��������������ϵͳ������ķ�תһ����������
	 *
	 * @param str
	 * @return
	 */
	public String reverse(String str) {
		if(str == null)
			throw new NullPointerException();
		char[] ch = new char[str.length()];
		ch = str.toCharArray();
		// ����ж����� i<=j ���� i<j ���ǿ��Ե�
		for (int i = 0, j = ch.length - 1; i <= j; i++, j--) {
			char c = ch[i];
			ch[i] = ch[j];
			ch[j] = c;
		}
		String newstr = new String(ch);
		return newstr;
	}
	/**
	 * ͨ��ջ��ӡ�ַ���
	 * @param str
	 * @return
	 */
	public String reverseStringByStack(String str){
		Stack<Character> stack = new Stack<Character>();
		char[] ch = str.toCharArray();
		for(int i = 0;i < ch.length ;i++)
			stack.push(ch[i]);
		for(int i = 0;i<ch.length;i++)
			ch[i] = stack.pop();
		String newStr = new String(ch);
		return newStr;
	}
	/**
	 * �ݹ������ַ���
	 * @param str
	 */
	public String reverseStringByRecur(String str) {
		if (str == null)
			throw new NullPointerException();
		//�ݹ����
		if (str.length() != 0) {
			char[] ch = str.toCharArray();
			char[] newCh = new char[ch.length - 1];
			for (int i = 0; i < ch.length - 1; i++)
				newCh[i] = ch[i + 1];
			String newStr = new String(newCh);
			reverseStringByRecur(newStr);
			char[] another_ch = new char[ch.length];
			for(int i = ch.length - 1;i >= 0;i--)
				another_ch[ch.length-1-i] = ch[i];
			String anotherNewStr = new String(another_ch);
			return anotherNewStr;
		}return null;
	}

	public static void main(String[] args) {
		/**
		 * ��Ȼ�ڹ����ַ�����ʱ����StringBuilder
		 */
		ReverseString rs = new ReverseString();
		String str1 = "123";
		System.out.println(rs.reverseStringByRecur(str1));

	}

}
