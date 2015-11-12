package src.HashTable;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author Administrator
 * 
 * Test
 * A : abcd			A : null		A : abcd
 * B : bc			B : abc			B : null
 * Output : ad		Output : null	Output :abcd
 */
class Remove{
	public char[] removeAInB_Method0(String a,String b){
		if(a==null || b==null)
		{
			return a.toCharArray();
		}
		else{
			char[] ch_a = a.toCharArray();
			char[] ch_b = b.toCharArray();
			HashSet<Character> set_b = new HashSet<Character>();
			HashSet<Character> set_a = new HashSet<Character>();
			for(int i = 0;i<ch_b.length;i++){
				set_b.add(ch_b[i]);
			}
			for(int i = 0;i<ch_a.length;i++){
				set_a.add(ch_a[i]);
			}
			for(int i = 0;i<ch_a.length;i++){
				if(set_b.contains(ch_a[i])){
					set_a.remove(ch_a[i]);
				}
			}
			char[] ch = new char[set_a.size()];
			Iterator<Character> iterator = set_a.iterator();
			int i = 0;
			while(iterator.hasNext())
			{
				ch[i] = iterator.next();
				i++;
			}
			return ch;
		}
	}
	
}
public class RemoveAInB {
	public static void main(String[] args) {
		String a = "hello world";
		String b = "er";
		Remove r = new Remove();
		for(char ch : r.removeAInB_Method0(a, b))
		{
			System.out.print(ch+" ");
		}
	}
}
