package src.Algorithms3;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {

	public int[] rotate(int[] nums, int k) {
		List<Integer> list = new ArrayList<Integer>();
		int i;
		int len = nums.length;
		//先把数据全部放入List
		for (i = 0; i < len; i++) {
			list.add(nums[i]);
		}
		/**
		 * [1, 2, 3, 4, 5, 6, 7]
		 * [7, 1, 2, 3, 4, 5, 6]
		 [6, 7, 1, 2, 3, 4, 5]
		 [5, 6, 7, 1, 2, 3, 4]
		 */
		System.out.println(list);
		for (i = 0; i < k; i++) {
			list.add(0, list.get(len - 1));//加1之后长度变成8了
			list.remove(len);
		}

		for (i = 0; i < nums.length; i++) {
			nums[i] = list.get(i);
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		RotateArray j = new RotateArray();
		for (int a : j.rotate(arr, 3))
			System.out.print(a);

		List list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		System.out.println(list);
//		list.add(0, 7);
//		list.add(0, 8);
		list.remove(4);
//		System.out.println(list);
	}
}
