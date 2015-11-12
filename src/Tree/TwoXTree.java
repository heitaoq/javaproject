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
	 * @param treenode
	 */
	public TreeNode createBinaryTree(){
		TreeNode treenode = null;
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
	 * @param treenode
	 */
	public TreeNode createAnotherBinaryTree(){
		TreeNode treenode = null;
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
	 * 后序遍历
	 * @param root
	 */
	public void postorderTraversal(TreeNode root) {
		if(root!=null){
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.val+" ");
		}
	}
	/**
	 * 中序遍历
	 * @param root
	 */
	public void inOrderTraversal(TreeNode root){

	}

	/**
	 * 先序遍历
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
	 * 递归的求解2X树的深度,找到递归出口,在MergeSort中,是只剩下最后一个元素的时候才开始进行比较合并
	 * 对遍历算法稍作修改即可
	 * @param root
	 * @return
	 */
	public int depth(TreeNode root){
		if(root!=null){
			int left = depth(root.left);
			int right = depth(root.right);
			return left > right ? left+1:right+1;
		}
		return 0;
	}

	/**
	 * 判断此2X树是否是平衡树 {任意结点的左右子树的深入相差不超过1}
	 * 在上面求过关于树的深入的问题之后，有了思路如下：
	 * 在遍历到2X树每个结点的时候,调用depth函数看其左右的结点的深入
	 * 并比较即可
	 * 弊端！！！重复遍历结点
	 * @param root
	 * @return
	 */
	public boolean isBalanceTree(TreeNode root){
		if(root==null)
			return true;
		int left = depth(root.left);
		int right = depth(root.right);
		if(Math.abs(left-right)>1)
			return false;
		return isBalanceTree(root.left) && isBalanceTree(root.right);
	}
	/**
	 * 整体过程是不是这样的：每次递归都先去判断该节点对应的左子树跟右子树是否满足平衡二叉树的条件，
	 * 然后每次递归判断的时候如果平衡的话是不是得去计算左子书-右子书，好，这个过程是每次递归都得经
	 * 历 的，可是后续遍历到最终遍历的节点那本它的左右子书就不满足平衡了，那么久要跳出来了。
	 * @param root
	 * @return
	 */
	public boolean isBalanceTreeWithoutReRead(TreeNode root,AuxClass aux){
		if(root == null){
			return true;
		}
		AuxClass leftDepth=new AuxClass();
		AuxClass rightDepth=new AuxClass();
		if(isBalanceTreeWithoutReRead(root.left,leftDepth) &&
				isBalanceTreeWithoutReRead(root.right,rightDepth)){
			int diff = leftDepth.depth - rightDepth.depth;
			if(Math.abs(diff)<=1)
			{
				aux.depth = 1 + (leftDepth.depth > rightDepth.depth ? leftDepth.depth : rightDepth.depth);
				System.out.println("结点为："+ root.val+" "+aux.depth);
				return true;
			}
		}
		return false;
	}
	/**
	 * 2X树的递归算法
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> inorderTraversal(TreeNode root){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root!=null){
			inorderTraversal(root.left);
			list.add(root.val);
			inorderTraversal(root.right);
		}
		return list;
	}
	/**
	 * 2X树非递归算法
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> inorderTraversalWithoutRecursion(TreeNode root){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null || !stack.empty())
		{
			if(root!=null){
				stack.push(root);
				root = root.left;
			}else{
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
	 *   层次遍历
	 *   输出为 1 2 3 4 5 6 7
	 * @param treenode
	 */
	public ArrayList<Integer> levelOrder(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			list.add(queue.peek().val);
			root = queue.remove();
			if(root.left!=null || root.right!=null){
				queue.add(root.left);
				queue.add(root.right);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		TwoXTree in = new TwoXTree();
		TreeNode treenode = in.createBinaryTree();
		AuxClass aux = new AuxClass();
//		System.out.println("平衡树吗? "+in.isBalanceTreeWithoutReRead(treenode,aux));
		in.postorderTraversal(treenode);
	}

	public static class AuxClass{
		private int depth;
	}

}