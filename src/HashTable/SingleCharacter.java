package src.HashTable;

import java.util.HashMap;

class SolveSingleCharacter {
	/**
	 * �����
	 * @param str
	 * @return
	 */
	public char method(String str) {
		char ch = '.';
		char[] c = str.toCharArray();
		int size = c.length;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = c[i];
		}
		int x = 0;
		for (int a : arr) {
			x = x ^ a;
		}
		ch = (char) x;
		return ch;
	}
	
	/**
	 * HashMap���
	 * @param str
	 */
	public void singleChar(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i]))
				map.put(ch[i], map.get(ch[i]) + 1);
			else
				map.put(ch[i], 1);
		}
		//��ס,����map��size
		// for(int i = 0 ;i<map.size();i++){
		// int a = map.get(ch[i]);
		// if(a==1)
		// System.out.println(ch[i]);
		// }
		for (int i = 0; i < ch.length; i++) {
			int a = map.get(ch[i]);
			if (a == 1)
				System.out.println(ch[i]);
		}
	}
}

public class SingleCharacter {
	public static void main(String[] args) {
		SolveSingleCharacter s = new SolveSingleCharacter();
		s.singleChar("aah");
	}
}
