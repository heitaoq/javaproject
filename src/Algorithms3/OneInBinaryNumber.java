package src.Algorithms3;

public class OneInBinaryNumber {

	/**
	 * http://coderlxl201209164551.iteye.com/blog/1705576
	 * ��������������������Ĳ�����һ������������һλ������
	 * �򵥵İ�0x80000000��Ϊ0x40000000������0xC0000000��
	 * ��Ϊ��λǰ�Ǹ���������λ��Ҫ��һ�������������������ѭ����
	 * @param n
	 * @return
	 */
	public int numberOf1(int n){
		int count = 0;
		while(n!=0){
			if((n&1) != 0)
				count ++;
			n>>=1;
		}
		return count;
	}

	/**
	 * ��������������
	 * @param n
	 * @return
	 */
	public int numberOf1_(int n){
		int count = 0;
		int flag = 1;
		int i = 0;
		while(i<32){//��ѭ��32��
			if((n & flag) !=0 )
				count++;
			flag = flag<<1;
			i++;
		}
		return count;
	}

	public static void main(String[] args) {

		OneInBinaryNumber o = new OneInBinaryNumber();
		System.out.println(o.numberOf1_(0x80000000));
		System.out.println(o.numberOf1_(5));//00000000000000000...101
	}
}