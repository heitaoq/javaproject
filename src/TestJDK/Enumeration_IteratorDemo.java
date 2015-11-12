package src.TestJDK;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * 
 * @author Administrator
 *
 */
public class Enumeration_IteratorDemo {
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(110);
		vector.add(120);
		vector.add(110);
		vector.add(140);
		
		for (Enumeration<Integer> e = vector.elements();e.hasMoreElements();){
			System.out.println(e.nextElement());
		}
		
		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			int i = iterator.next();
			System.out.println(i);
		}
	}
}
