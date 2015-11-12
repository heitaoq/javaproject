package src.Algorithms3;

import java.util.ArrayList;
/**
 * 最小的k个数
 * @author Administrator
 *
 */
public class TheMinestKNumbers {

	/**
	 * 方法一：先把输入的数据进行排序，然后选择前k个大的数即可 O(nlgn)
	 * 方法二：把输入的数据构建一个最小堆O(n)，然后每次输入堆顶元素之后，
	 * 重新维护好堆O(lgn)。总的时间为O(n)
	 * @param input
	 * @param k
	 * @return
	 */
	public ArrayList<Integer> GetLeastNumbers_Solution(
			ArrayList<Integer> input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		return list;
	}

	public static void main(String[] args) {

	}
}
