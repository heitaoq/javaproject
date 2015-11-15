package src.Algorithms1;

import java.util.Stack;

class QNode {
	int data;
	QNode next;

	public QNode(int data) {
		this.data = data;
		next = null;
	}
}

public class ReverseLinkedList {

	// 1 2 3 4 5
	QNode createLinkedList(){
		QNode node = new QNode(1);
		node.next = new QNode(2);
		node.next.next = new QNode(3);
		node.next.next.next = new QNode(4);
		node.next.next.next.next = new QNode(5);
		return node;
	}
	/**
	 * 单链表的翻转
	 * 递归打印
	 * @param node
	 */
	void reverseLinkedList(QNode node){
		//递归的终止条件
		if(node!=null) {
			reverseLinkedList(node.next);
			System.out.print(node.data + " ");
		}
	}

	void reverseLinkedListByStack(QNode node){
		Stack<QNode> stack = new Stack<QNode>();
		QNode qnode = createLinkedList();
		while(qnode != null){
			stack.add(qnode);
			qnode = qnode.next;
		}
		while(stack.size() != 0){
			System.out.println(stack.pop().data + " ");
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList r = new ReverseLinkedList();
		QNode node = r.createLinkedList();
		r.reverseLinkedListByStack(node);
	}
}
