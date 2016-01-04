package src.Algorithms2;

import java.util.Arrays;
/**
 * ���֮��,����Ѱ������������2����
 * �����������кܶ���Ŀ���Ǹ���һ������,Ҫ�󷵻�2���±��(������2��Ԫ��,������һ��������)
 * ����Ӧ�Ƚϸ�Ч�Ľⷨ����������,Ȼ����һ��ѭ��������2������(ָ��)���з���ı���
 *
 */
public class FindTwoNumberEqualsOneNumber {

	public boolean find(int[] arr,int value) {
		if(arr == null)
			throw new NullPointerException(); // ����ط�������ô���ø��������Ҫ����������һ����Ҫ����һ��NPE
		//Ҫ������
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		for( ; i < j ; ) {
			if( arr[i]+arr[j] == value ) {
				return true;
			} else if ( arr[i]+arr[j]<value ){
				i++;
			} else {
				j--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		FindTwoNumberEqualsOneNumber f = new FindTwoNumberEqualsOneNumber();
		int[] arr = {5,6,1,4,7,9,9,8};
		int value = 18;
		System.out.println(f.find(arr, value));
		System.out.println("final hello ");
	}
}
