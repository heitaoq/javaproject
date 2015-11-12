package src.Algorithms1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayList_LinkedList {

	public static void main(String[] args) {
		List<Integer> arrlist = new ArrayList<Integer>();
		/**
		 *  Appends the specified element to the end of this list.
		 *  elementData[size++] = e;
		 */
		arrlist.add(1);
		arrlist.add(3, 12);
		arrlist.remove(1);
		arrlist.get(3);//ArrayList的随机访问很快，根据index访问
		arrlist.set(3, 33);

		List<Integer> linlist = new LinkedList<Integer>();
		linlist.add(1);
		linlist.add(3, 14);
		linlist.remove(3);
		linlist.get(3);//从链表的一端开始检查一直到另一端，耗时
		linlist.set(12, 14);
		//Vector线程同步的
		Vector v = new Vector(4);
		v.add("Test0");
		v.add("Test1");
	}

}
