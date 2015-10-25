package src.Leecode;

/**
 *  https://leetcode.com/problems/rotate-list/
 */

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
  }
}

public class RotateList {

  /**
   * The basic idea is link the head to tail. and then count to the rotate point
   * and cut it. (cut it means null)
   */
  public static ListNode rotateRight(ListNode head, int k) {
    if (head == null || k <= 0 )
      return head;
    ListNode copyHead = head;
    int len = 1;
    while (copyHead.next != null) {
      copyHead = copyHead.next;
      len ++;
    }
    copyHead.next = head;
    for (int i = len - k % len; i > 1;i--) {
      head = head.next;
    }
    copyHead = head.next;
    head.next = null;
    return copyHead;
  }

  public static void main(String[] args) {
    ListNode list = new ListNode(1);
    list.next = new ListNode(2);
    list.next.next = new ListNode(3);
    list.next.next.next = new ListNode(4);
    list.next.next.next.next = new ListNode(5);
    list = rotateRight(list, 2);
    while (list != null) {
      System.out.print(list.val + " ");
      list = list.next;
    }
  }
}
