package src.Algorithms3;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
		next = null;
	}
}

public class ReverseLinkedList {

	public void printLinkedList(ListNode list){
		while(list != null) {
			System.out.print(list.val);
			list = list.next;
		}
	}

  /**
   * 看图理解单链表反转
   * http://www.2cto.com/kf/201110/106607.html
   * @param pHead
   * @return
   */
	public ListNode reverseLinkedList(ListNode pHead){
		ListNode p = pHead;
    ListNode q = pHead.next; // working point
    ListNode r;
    pHead.next = null;
    while (q != null) {
      r = q.next;
      q.next = p;
      p = q;
      q = r;
    }
    pHead = p;
    return pHead;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
    list.next.next.next = new ListNode(4);
		ReverseLinkedList r = new ReverseLinkedList();
		ListNode rl = r.reverseLinkedList(list);
		r.printLinkedList(rl);
	}
}