package src.Algorithms3;

import java.util.Stack;

/**
 * 输入一个英文字句,翻转句子中单词的顺序,但单词内字符的顺序不变。
 * Given an input string, reverse the string word by word. For example,
 *
 * Given s = "the sky is blue", return "blue is sky the".
 *
 */
public class ReverseWordsInaString {

	/**
	 * 先把整个字符串逆序,再翻转里面的每个单词
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder(s);
		String newStr = sb.reverse().toString();//yks eht
		char[] ch = newStr.toCharArray();
		int i = 0;
		char p1 = ch[i];
		char p2 = ch[i];
		while(p1 != ' '){
			p1 = ch[i++];
		}

		return newStr;
	}


	public static void main(String[] args) {
		ReverseWordsInaString r = new ReverseWordsInaString();
		String str = "the sky";
		System.out.println(r.reverseWords(str));
	}
}
