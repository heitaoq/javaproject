package src.Algorithms3;

import java.util.ArrayList;

/**
 * http://www.nowcoder.com/profile/885117/codeBookDetail?submissionId=71435
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，
 * 输出旋转数组的最小元素。例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * 
 * @author Administrator
 *
 */
public class RotateArrayMinNumber {
	public int minNumberInRotateArray(ArrayList<Integer> array) {
		if (array == null || array.size() == 0)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) < min)
				min = array.get(i);
		}
		return min;
	}

	/**
	 * 利用了旋转数组的性质了
	 * @param num
	 * @return
	 */
	public int findMin(int[] num) {
		int start = 0, end = num.length - 1;
		while (start + 1 < end) 
		{
			int mid = start + (end - start) / 2;
			if (num[mid] == num[start] && num[start] == num[end]) {
				return min(num);
			} else if (num[mid] >= num[end]) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (num[start] < num[end]) {
			return num[start];
		} else {
			return num[end];
		}
	}

	public int min(int[] num) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (min > num[i])
				min = num[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		RotateArrayMinNumber r = new RotateArrayMinNumber();
		System.out.println(r.findMin(arr));
	}
}
