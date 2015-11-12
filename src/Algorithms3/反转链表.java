package src.Algorithms3;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
		next = null;
	}
}

public class 反转链表 {

	public void printLinkedList(ListNode ld){
		while(ld != null) {
			System.out.print(ld.val);
			ld = ld.next;
		}
	}

	public ListNode reverseLinkedList(ListNode pHead){
		ListNode pReverseHead = null;
		ListNode pNode = pHead; //指向当前遍历到的结点
		ListNode pPrev = null;
		while(pNode != null){
			ListNode pNext = pNode.next;
			if(null == pNext)
				pReverseHead = pNode;
			pNode.next = pPrev;

			pPrev = pNode;
			pNode = pNext;
		}
		return pReverseHead;
	}

	public static void main(String[] args) {
		ListNode ld = new ListNode(1);
		ld.next = new ListNode(2);
		ld.next.next = new ListNode(3);
		反转链表 r = new 反转链表();
		ListNode rl = r.reverseLinkedList(ld);
		r.printLinkedList(rl);
	}
}