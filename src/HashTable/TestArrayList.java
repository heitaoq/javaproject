package src.HashTable;

import java.util.ArrayList;

public class TestArrayList {
	public void initList()
	{
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("zhang");
		list1.add("qhang");
		list1.add("rhang");
		list1.add("ohang");
		 
		for(int i = 0;i<list1.size();i++)
		{
			list.add(list1);
			list1.clear();
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		TestArrayList list = new TestArrayList();
		list.initList();
		
		
	}

}
