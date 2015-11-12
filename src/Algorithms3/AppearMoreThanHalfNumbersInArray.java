package src.Algorithms3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组中出现超过一半的数字，如果不存在返回 0
 * @author Administrator
 *
 */
public class AppearMoreThanHalfNumbersInArray {

	public int MoreThanHalfNum_Solution(int[] array) {
		Arrays.sort(array);
		int middleValue = array[array.length >>> 1];
		int count = 0;
		for(int i = 0;i<array.length;i++){
			if(middleValue == array[i])
				count++;
		}
		if(count < array.length >>> 1)
			return 0;
		return middleValue;
	}

	public int MoreThanHalfNum_Solution(ArrayList<Integer> array) {
		int value = 0;
		int count = 0;
		int[] arr = new int[array.size()];
		for(int i = 0;i<array.size();i++){
			arr[i] = array.get(i);
		}
		Arrays.sort(arr);
		value = arr[arr.length >>> 1];
		for(int i = 0;i<arr.length;i++){
			if(value == arr[i])
				count++;
		}
		if(count < arr.length >>> 1)
			return 0;
		return value;
	}

	public static void main(String[] args) {
		AppearMoreThanHalfNumbersInArray a = new AppearMoreThanHalfNumbersInArray();
		int[] arr = { 1,2,3,2,4,5,2,3};
		System.out.println(a.MoreThanHalfNum_Solution(arr));
	}
}
