package src.Algorithms2;

import java.util.HashMap;
import java.util.Map;


public class FindOnlyOneTimeCharInString {
	public void findChar(String str){
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		Integer count = null;
		for(int i = 0;i < ch.length;i++){
			count = map.get(ch[i]);
			map.put(ch[i], count == null ?1:++count);
		}
		System.out.println(map);
		int max = 0;
		for(int i = 0;i<map.size();i++){
			int value = map.get(ch[i]);
			if(value>max){
				max = value;
			} 
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		FindOnlyOneTimeCharInString f = new FindOnlyOneTimeCharInString();
		f.findChar("abccaddddddddfaaaaaaaaaaaaaaaaaagh");
	}
}
