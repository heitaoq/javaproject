
package src.Algorithms1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
	int key;
	Node next;
}

public class TestStackAndQueue {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop()+" "+stack.peek()+" "+stack.peek());
	
		queue.add(1);
		queue.add(2);
		queue.add(3);
		while(queue.size() != 0)
			System.out.println(queue.poll());
	}
}
