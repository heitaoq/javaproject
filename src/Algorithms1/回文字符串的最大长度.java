package src.Algorithms1;

/**
 *譬如给你一个字符串，计算这个字符串里面的对称字符串的最大长度
 譬如google， 对称字符串的最大长度是4
 主要看你能不能把握在哪里需要递归调用当前的方法
 以及怎么跳出递归
 * @author Administrator
 *
 */
public class 回文字符串的最大长度 {
	/**
	 * 过程：g: go goo goog googl google 然后去掉g，o:oo oog oogl oogle 然后去掉o o:og ogl ogle
	 * 难点在于：第一个是：在什么地方递归调用（反复调用哪一段代码），第二是递归出口
	 *
	 * 去掉g 字符串还剩 oogle 去掉o 字符串还剩ogle 去掉o 还剩gle 去掉 g 还剩le 这时候判断完后即可跳出递归
	 * @param str
	 * @return
	 */
	public String reverse(String str){
		char[] ch = new char[str.length()];
		ch = str.toCharArray();
		//这个判断条件 i<=j 还是 i<j 都是可以的
		for(int i = 0,j = ch.length-1;i<=j;i++,j--){
			char c = ch[i];
			ch[i] = ch[j];
			ch[j] = c;
		}
		String newstr = new String(ch);
		return newstr;
	}
	/**
	 * 字符串toCharArray 然后定义一个临时变量 temp foreach 那个字符数组，然后temp+每次循环的字符，拿这个临时字符串去判断是否为对称
	 * 因为每次递归调用都减去一个字符，总有减完的时候，也就是递归的出口
	 * @param str
	 * @return
	 */
	public int maxLength(String str){
		int length = 0;
		char[] newCh = null;
		if(str.length()>0)
		{
			char[] ch = str.toCharArray();
			String temp = ""; //注意,不能写成String temp = null
			for(int i = 0;i<ch.length;i++){
				temp = temp + ch[i];
				if(reverse(temp).equals(temp)){
					length = temp.length();
				}
			}
			newCh = new char[ch.length-1];
			for(int i = 0;i<newCh.length;i++){
				newCh[i] = ch[i+1];
			}
			int a = maxLength(new String(newCh));
			if(a > length){
				return a;
			}else{
				return length;
			}
		}else{
			return 0;
		}
	}

	public static void main(String[] args) {
		回文字符串的最大长度 s = new 回文字符串的最大长度();
		System.out.println(s.maxLength("levellevael"));
	}
}
