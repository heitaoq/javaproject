package src.Algorithms2;

/**
 * ����ΪʲôҪ��ȡ���������򷽷���
 * ���ڴ治��ʹ�õ�ʱ�򣬿��Բ�ȡ
 * ��������û����ͬ������ ˼·��Դ:��������һ���Ǹ��˺����ߵĶԻ�,��������λͼ������绰�������������,
 * 1000�����ͬ����������ɵĵ绰��������1000��λ,����1000��bits
 * 
 * @author Administrator
 *
 */
class SolveBitMapSort {
	public char[] sort(int[] arr) {
		int i = 0, max = 0;
		int size_0 = arr.length;
		/**
		 * ���ҳ�arr������������ֵ,Ȼ���������ֵ��Ϊ�ַ�����Ĵ�С
		 */
		for (;i < size_0; i++){
			if (arr[i] > max)
				max = arr[i];
		}
		char[] ch = new char[max + 1];// ע��,����Ҫ��1 ��Ϊ�����ҵ������ֵ��999,��������������ַ�ΧΪ0 ~ 999,Ϊ1000������
		int size_1 = ch.length;
		/**
		 * ��ʼ���ַ�����
		 */
		for (i = 0; i < size_1; i++){
			ch[i] = '0';
		}
		/**
		 * �������������������Ϊ�ַ�������±꣬�����ַ�����Ķ�Ӧ��Ԫ����1
		 */
		int size_2 = arr.length;
		for (i = 0; i < size_2; i++)
		{
			int temp = arr[i];
			ch[temp] = '1';
		}
		return ch;
	}
}
public class BitMapSort {
	public static void main(String[] args) {
		int arr[] = { 4, 10, 9, 3, 30, 999, 12, 456, 833, 129 };
		for (char c : new SolveBitMapSort().sort(arr))
			System.out.print(c + " ");
		System.out.println();
		char[] ch = new SolveBitMapSort().sort(arr);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '0')
				System.out.print(i + " ");
		}
	}
}
