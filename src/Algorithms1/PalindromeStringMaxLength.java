package src.Algorithms1;

/**
 *Ʃ�����һ���ַ�������������ַ�������ĶԳ��ַ�������󳤶�
 Ʃ��google�� �Գ��ַ�������󳤶���4
 ��Ҫ�����ܲ��ܰ�����������Ҫ�ݹ���õ�ǰ�ķ���
 �Լ���ô�����ݹ�
 * @author Administrator
 *
 */
public class PalindromeStringMaxLength {
	/**
	 * ���̣�g: go goo goog googl google Ȼ��ȥ��g��o:oo oog oogl oogle Ȼ��ȥ��o o:og ogl ogle
	 * �ѵ����ڣ���һ���ǣ���ʲô�ط��ݹ���ã�����������һ�δ��룩���ڶ��ǵݹ����
	 *
	 * ȥ��g �ַ�����ʣ oogle ȥ��o �ַ�����ʣogle ȥ��o ��ʣgle ȥ�� g ��ʣle ��ʱ���ж���󼴿������ݹ�
	 * @param str
	 * @return
	 */
	public String reverse(String str) {
		char[] ch = str.toCharArray();
		//����ж����� i<=j ���� i<j ���ǿ��Ե�
		for(int i = 0,j = ch.length-1;i<=j;i++,j--){
			char c = ch[i];
			ch[i] = ch[j];
			ch[j] = c;
		}
		return new String(ch);
	}
	/**
	 * �ַ���toCharArray Ȼ����һ����ʱ���� temp foreach �Ǹ��ַ����飬Ȼ��temp+ÿ��ѭ�����ַ����������ʱ�ַ���ȥ�ж��Ƿ�Ϊ�Գ�
	 * ��Ϊÿ�εݹ���ö���ȥһ���ַ������м����ʱ��Ҳ���ǵݹ�ĳ���
	 * @param str
	 * @return
	 */
	public int maxLength(String str){
		if (str == null)
			throw new NullPointerException("Pass Null Value"); // According to your business
		int length = 0;
		char[] newCh;
		if(str.length()>0)
		{
			char[] ch = str.toCharArray();
			String temp = ""; //ע��,����д��String temp = null
			for(int i = 0 ; i < ch.length ; i++) {
				temp = temp + ch[i];
				if(reverse(temp).equals(temp)) {
					length = temp.length();
				}
			}
			newCh = new char[ch.length-1];
			for(int i = 0 ; i < newCh.length ; i++) {
				newCh[i] = ch[i+1];
			}
			int a = maxLength(new String(newCh));
			if(a > length) {
				return a;
			} else {
				return length;
			}
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		PalindromeStringMaxLength s = new PalindromeStringMaxLength();
		System.out.println(s.maxLength("levellevael"));
        System.out.println(s.maxLength(null));

    }
}
