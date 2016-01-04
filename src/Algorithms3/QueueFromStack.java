package src.Algorithms3;

import java.util.Stack;
/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * Idea
 * ��һ��ջʵ�ֶ��е�push����һ��ջ��ɶ��е�Pop��ע����pop��ʱ�򣬱���ȵ�
 * �Ȱ�stack2�����Ԫ��ȫ��pop��֮�󣬲ſ��Լ�����stack1�����Ԫ��push��stack2����
 * @author Administrator
 *
 */
public class QueueFromStack {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		//��stack2���滹��Ԫ�ص�ʱ��,��������������
		while(stack2.size()>0){
			return stack2.pop();
		}
		while(stack1.size()!=0){
			int node = stack1.pop();
			stack2.push(node);
		}
		int node = stack2.pop();
		return node;
	}

	public static void main(String[] args) {
		QueueFromStack q = new QueueFromStack();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
		q.push(4);
		System.out.println(q.pop());
		System.out.println(q.pop());
		q.push(5);
		q.push(6);
		System.out.println(q.pop());
	}
}
