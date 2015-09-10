//package DataStructure;
//
//import java.util.Iterator;
//
///**
// *
// */
//
//public class XLinkedList<E> implements Iterable {
//
//  transient Node<E> last;
//  transient Node<E> first;
//  transient int size = 0;
//
//  public XLinkedList() {}
//
//  /**
//   * Construct a Node.
//   * @param <E>
//   */
//  private static class Node<E> {
//    E element;
//    Node<E> next;
//    Node<E> prev;
//
//    Node(E element, Node<E> prev, Node<E> next) {
//      this.element = element;
//      this.prev = prev;
//      this.next = next;
//    }
//  }
//
//  /**
//   * Append a element to the end of the list.
//   * @param e
//   */
//  public void add(E e) {
//    Node<E> l = last;
//    Node<E> newNode = new Node<>(e, l, null);
//    last = newNode;
//    if (l == null)
//        first = newNode;
//    else
//        l.next = newNode;
//    size++;
//  }
//
//  public int size() {
//    return size;
//  }
//
//  @Override
//  public Iterator iterator() {
//    return null;
//  }
//}
