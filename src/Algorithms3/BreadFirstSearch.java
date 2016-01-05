package src.Algorithms3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by root on 16-1-5.
 */

class Node {
  List neighbors;
  Node pathParent;
  String name;

  public Node(String name) {
    this.name = name;
    neighbors = new LinkedList();
  }

  public String toString() {
    return name;
  }
}

public class BreadFirstSearch {

  public List constructPath(LinkedList list) {
    System.out.println("BFS path：" + list.toString());
    return list;
  }

  public List search(Node startNode, Node goalNode) {
    LinkedList closedList = new LinkedList();
    LinkedList openList = new LinkedList();
    openList.add(startNode);
    startNode.pathParent = null;
    while (!openList.isEmpty()) {
      Node node = (Node) openList.removeFirst();
      if (node == goalNode) {
        //return constructPath(goalNode);
        //路径就是closed表中的顺序
        return constructPath(closedList);
      } else {
        closedList.add(node);
        Iterator i = node.neighbors.iterator();
        while (i.hasNext()) {
          Node neighborNode = (Node) i.next();
          if (!closedList.contains(neighborNode) &&
              !openList.contains(neighborNode)) {
            neighborNode.pathParent = node;
            openList.add(neighborNode);
          }
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");
    Node nodeD = new Node("D");
    Node nodeE = new Node("E");
    Node nodeF = new Node("F");
    Node nodeG = new Node("G");
    Node nodeH = new Node("H");

    nodeA.neighbors.add(nodeC);
    nodeA.neighbors.add(nodeD);
    nodeA.neighbors.add(nodeE);
    nodeB.neighbors.add(nodeE);
    nodeC.neighbors.add(nodeA);
    nodeC.neighbors.add(nodeD);
    nodeC.neighbors.add(nodeF);
    nodeD.neighbors.add(nodeA);
    nodeD.neighbors.add(nodeC);
    nodeE.neighbors.add(nodeA);
    nodeE.neighbors.add(nodeB);
    nodeE.neighbors.add(nodeG);
    nodeF.neighbors.add(nodeC);
    nodeF.neighbors.add(nodeH);
    nodeG.neighbors.add(nodeE);
    nodeH.neighbors.add(nodeC);
    nodeH.neighbors.add(nodeF);

    BreadFirstSearch bfs = new BreadFirstSearch();
    System.out.println(bfs.search(nodeA, nodeG));

  }

}















