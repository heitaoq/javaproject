package src.TestJDK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
/**
 * 如果你想一个类不被别的类继承,那么就采用final修饰
 *
 * @author Administrator
 *
 */
final class Car {
	public void equalJudge(Object obj) {
		if (obj instanceof Car) {
			Car str = (Car) obj;
			System.out.println(str);
		} else {
			System.out.println("This object is not a instance of JDKTest");
		}
	}
	@Override
	public String toString() {
		return "This is a JDKTest";
	}
	public boolean twoCharArrayIsEqual(char[] a, char[] b) {
		if (a.length == b.length) {
			int n = a.length;
			int i = 0;
			while (n-- != 0) {
				if (a[i] != b[i])
					return false;
				i++;
			}
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 去除字符数组两边的空格
	 *
	 * @param ch
	 * @return
	 */
	public String myTrim(char[] ch) {
		String str = new String(ch);
		int len = ch.length;
		int st = 0;
		while (ch[st] == ' ')
			st++;
		while (ch[len - 1] == ' ')
			len--;
		return str.substring(st, len);
	}

	public void testCollection() {
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(1);
		c.add(2);
		Iterator<Integer> iterator = c.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.println(integer);
		}
	}
}
public class JDKTest {
	private class TestComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			if (o1 > o2) {
				return 1;
			} else if (o1 < o2) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	public static void main(String[] args) {
		JDKTest jdkt = new JDKTest();
		TestComparator tc = jdkt.new TestComparator();
		Integer[] a =  {10,5,34,12,1,1,0,45};
		Arrays.sort(a,tc);
//		Arrays.sort(a);
		for(int i = 0;i<a.length;i++)
			System.out.println(a[i] + " ");
	}
}
