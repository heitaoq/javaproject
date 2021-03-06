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
   *
   * Compare to the RotateArray, a circle is also common in there.
   */
  public static ListNode rotateRight(ListNode head, int k) {
    if (head == null || k <= 0 )
      return head;
    ListNode newHead = head;
    int len = 1;
    while (newHead.next != null) { // can not use newHead != null, cause jump to the while, newHead is null.
      newHead = newHead.next;
      len ++;
    }
    newHead.next = head; // make the list into a circle.
    for (int i = k % len; i < len - 1 ;i++) {
      head = head.next;
    }
    newHead = head.next;
    head.next = null;
    return newHead; // return a new ListNode
  }

  public static void main(String[] args) {
    ListNode list = new ListNode(1);
    list.next = new ListNode(2);
    list.next.next = new ListNode(3);
    list.next.next.next = new ListNode(4);
    list.next.next.next.next = new ListNode(5);
    list = rotateRight(list, 6);
    while (list != null) {
      System.out.print(list.val + " ");
      list = list.next;
    }
  }
}
