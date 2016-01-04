package src.Tree;

public class NumberOfNodesIn2XTree {

	/**
	 * ��2X�����ĸ���
	 * @param root
	 * @return
	 */
	public int numbersOfNodes(TreeNode root) {
		if (root != null) {
			return numbersOfNodes(root.left) + numbersOfNodes(root.right) + 1;
		} else
			return 0;
	}
	/**
	 * ���������K��Ľڵ����,˼·��������k��Ľ�����,��ô������� k-1��
	 * �����Һ��ӵĽ������ĺ�
	 * @param root
	 * @return
	 */
	public int numberOf_K_thNode(TreeNode root,int k){
		if(root == null || k==0)
			return 0;
		if(k == 1)
			return 1;
		int numLeft = numberOf_K_thNode(root.left, k-1);
		int numRight = numberOf_K_thNode(root.right, k-1);
		return numLeft + numRight;
	}
	/**
	 * ��2X����Ҷ�ӽ��ĸ���,˼·��.ʲô��Ҷ�ӽ�㣿��ʲô���ʣ�
	 * ��������Ϊ�յĽ�㼴ΪҶ�ӽ��
	 * �ݹ�ı���ÿһ�����,ֻҪ�������������������Ϊ�վͼ�1
	 * @param root
	 * @return
	 */
	public int numberOfLeafNode(TreeNode root){
		if(root == null)
			return 0;
		if(root.left == null && root.right ==null)
			return 1;
		return numberOfLeafNode(root.left) + numberOfLeafNode(root.right);
	}

	/**
	 * �ж�2��2X���Ƿ�ṹ��ͬ
	 * �ݹ��ȥ�ж�ÿһ�����
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean same2XTree(TreeNode root1,TreeNode root2){
		if(root1 == null && root2 == null)
			return true;
		if((root1 ==null && root2!=null) || (root1!=null && root2 == null))
			return false;
		boolean leftTree = same2XTree(root1.left, root2.left);
		boolean rightTree = same2XTree(root1.right, root2.right);
		return leftTree && rightTree;
	}
	/**
	 * ��2X���ľ���
	 * @param root
	 */
	public void mirrorOf2XTree(TreeNode root){
		//���������ڻ���ֻ�и����
		if(root == null || (root.left ==null) &&
				(root.right == null))
			return;
		TreeNode tempNode;
		tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		if(root.left!=null)
			mirrorOf2XTree(root.left);
		if(root.right!=null)
			mirrorOf2XTree(root.right);
	}
	/**
	 * ��2X����2������������
	 * @param root
	 * @return
	 */
//	public int maxDistanceTree(TreeNode root){
//
//	}

	public static void main(String[] args) {
		TwoXTree tree = new TwoXTree();
		TreeNode root1 = tree.createBinaryTree();
		TreeNode root2 = tree.createAnotherBinaryTree();
		new NumberOfNodesIn2XTree().mirrorOf2XTree(root2);

	}
}

