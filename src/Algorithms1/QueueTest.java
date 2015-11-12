package src.Algorithms1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		 Queue<String> queue = new LinkedList<String>();  
	        queue.add("1");
	        queue.add("2");
	        queue.add("3");
	        String str = queue.remove();
	        for (String string : queue)  
	        {  
	            System.out.println(string);  
	        }  
	}
}
