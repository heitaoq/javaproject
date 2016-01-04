package src.Algorithms1;
/**
 * ��2����ҳ���͵ķǳ���
 * http://www.cnblogs.com/Fskjb/archive/2010/04/19/1715176.html
 * http://blog.csdn.net/rmn190/article/details/1492013#comments
 *
 * String �ַ�������
 * StringBuffer �ַ����������̰߳�ȫ��
 * StringBuilder �ַ������������̰߳�ȫ��
 *
 *
 */
public class StringBuffer_StringBuilder_String {

	void testPerformance() {
		/**
		 *
		 5266 millis has elapsed when used String.
		 375 millis has elapsed when used StringBuffer.
		 281 millis has elapsed when used StringBuilder.
		 ������Ľ�����������������ڵ��̳߳����е����ܲ��һĿ��Ȼ������String����ʱ����ʹ���д������ǲ������������1/100��
		 ��ִ��ʱ����Ȼ����������߳�25�����ϣ�������StringBuffer����Ͳ���StringBuilder����Ĳ��Ҳ�Ƚ����ԣ�ǰ���Ǻ���
		 ��1.5�����ҡ��ɴ˿ɼ���������ǵĳ������ڵ��߳������У������ǲ��ؿ��ǵ��߳�ͬ�����⣬����Ӧ������ʹ��StringBuilder
		 �ࣻ��Ȼ�����Ҫ��֤�̰߳�ȫ����Ȼ��StringBufferĪ���ˡ�
		 */
	}

	public static void main(String[] args) {
		/**
		 * �������ַ������������ͻ�������� 1,12,123,23,234���������õ��ַ�������������ֻ��Ҫʹ��1234�Ϳ�����
		 * ������ҪStringBuffer��StringBuilder������ƴ��
		 */
		String str = "1" + "2" + "3" + "4";

		/**
		 * �̰߳�ȫ�ģ�Ҳ����˵����߳�ȥ������δ��룬���������һ����, StringBuffer������෽������
		 * synchronized�ؼ��֣�Ҳ����˵�������ͬʱ�����������ʱ��ͬ����ȥ����
		 * public synchronized StringBuffer append(?)
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("1");
		sb.append("2");
		sb.append("3");
		sb.append("4");
		System.out.println(sb.toString()); //��StringBuffer����ת����String����

		/**
		 * �̲߳���ȫ�ģ�����߳�(����)ȥ������δ�����ܻᵼ��ƴ�Ӵ��󣬽������´���
		 * public StringBuilder append
		 */
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("zhang");
		sBuilder.append("ming");
		sBuilder.append("lei");
		System.out.println(sBuilder.toString());

	}
}
