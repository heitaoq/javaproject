package src.Algorithms1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> arrlist = new ArrayList<Integer>();
		List<Integer> linlist = new LinkedList<Integer>();
		//Vector线程同步的
		Vector v = new Vector(4);
		v.add("Test0");
		v.add("Test1");
	}
}
