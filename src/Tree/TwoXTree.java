package src.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode{
	int val;
	TreeNode left,right;
	public TreeNode(int val){
		this.val = val;
		this.left = this.right = null;
	}
}
public class TwoXTree{
	/**
	 *         1
	 *     2       3
	 *   4   5   6   7
	 *                 8
	 *              12   9
	 */
	public TreeNode createBinaryTree(){
		TreeNode treenode;
		treenode = new TreeNode(1);
		treenode.left = new TreeNode(2);
		treenode.left.left = new TreeNode(4);
		treenode.left.right = new TreeNode(5);
		treenode.right = new TreeNode(3);
		treenode.right.left = new TreeNode(6);
		treenode.right.right = new TreeNode(7);
		treenode.right.right.right = new TreeNode(8);
		treenode.right.right.right.left = new TreeNode(12);
		treenode.right.right.right.right = new TreeNode(9);
		return treenode;
	}
	/**
	 *         1
	 *     2       3
	 *   4   5   6   7
   *
	 */
	public TreeNode createAnotherBinaryTree(){
		TreeNode treenode;
		treenode = new TreeNode(1);
		treenode.left = new TreeNode(2);
		treenode.left.left = new TreeNode(4);
		treenode.left.right = new TreeNode(5);
		treenode.right = new TreeNode(3);
		treenode.right.left = new TreeNode(6);
		treenode.right.right = new TreeNode(7);
		return treenode;
	}

	/**
	 * �������
	 * @param root
	 */
	public void postorderTraversal(TreeNode root) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.val+" ");
		}
	}
	/**
	 * �������
	 * @param root
	 */
	public void inOrderTraversal(TreeNode root){
    if (root != null) {
      inOrderTraversal(root.left);
      System.out.println(root.val + " ");
      inOrderTraversal(root.right);
    }
	}

	/**
	 * �������
	 * @param root
	 */
	public void preOrderTraversal(TreeNode root){
		if(root != null){
			System.out.println(root.val + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	/**
	 * �ݹ�����2X�������,�ҵ��ݹ����
	 */
	public int depth(TreeNode root) {
		if(root!=null) {
			int left = depth(root.left);
			int right = depth(root.right);
			return left > right ? left+1:right+1;
		}
		return 0;
	}

	/**
	 * �жϴ�2X���Ƿ���ƽ���� {���������������������������1}
   *
   * ����Ҫ��ÿ���ڵ㶼�ж�һ�Σ�һֱ��û�нڵ�Ϊֹ�� �ݹ��ȥ�ж�ÿ���ڵ�
   *
	 * ��������������������������֮������˼·���£�
	 * �ڱ�����2X��ÿ������ʱ��,����depth�����������ҵĽ�������
	 * ���Ƚϼ���
	 * �׶ˣ������ظ��������
   *
   * �ݹ���ж����������ǲ���ƽ����
	 */
	public boolean isBalanceTree(TreeNode root){
		if(root==null)
			return true;
		int left = depth(root.left);
		int right = depth(root.right);
		if(Math.abs(left-right) > 1)
			return false;
		return isBalanceTree(root.left) && isBalanceTree(root.right);
	}

	/**
	 * 2X���ǵݹ��㷨
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> inorderTraversalWithoutRecursion(TreeNode root){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null || !stack.empty())
		{
			if(root!=null) {
				stack.push(root);
				root = root.left;
			} else {
				list.add(stack.peek().val);
				root = stack.pop();
				root = root.right;
			}
		}
		return list;
	}

	/**
	 *        1
	 *     2     3
	 *   4   5 6   7
	 *
	 *   ��α���
	 *   ���Ϊ 1 2 3 4 5 6 7
	 */
	public ArrayList<Integer> levelOrder(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) { // �ݹ�ĳ��ھ��Ƕ��в�Ϊ��
			list.add(queue.peek().val);
			root = queue.remove();
			if(root.left!=null || root.right!=null) {
				queue.add(root.left);
				queue.add(root.right);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		TwoXTree in = new TwoXTree();
		TreeNode treenode = in.createBinaryTree();
		in.postorderTraversal(treenode);
	}
}