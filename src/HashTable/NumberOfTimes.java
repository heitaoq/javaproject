package src.HashTable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfTimes {
	
	static Map<Integer, Integer> toSumNumber(int[] arr){
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		Integer count = 0;
		for(int i = 0;i < arr.length ; i++) {
			count = map.get(arr[i]);
			map.put(arr[i], count == null? 1 : ++count);
		}
		return map;
	}

	public static void main(String[] args) {
		int[] arr = {0,0,1,2,2,2,2,2,3,3,3,3,4};
		Map map = toSumNumber(arr);
		System.out.println(map);
	}

}
