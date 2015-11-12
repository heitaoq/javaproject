package src.Algorithms2;

import java.util.HashMap;
import java.util.Map;
/**
 * Hash表，因为给定一个数字，根据Hash映射查找另一个数字是否在数组中，只需要用O(1)时间
 * 但是这样的方法需要额外增加O(n)的hash表存储空间,但是也是一个好办法
 * 比如  5 6 1 4 7 9 8
 * 遍历到5的时候,查找另一个数字5是否在数组中是需要常数时间 (第一个5是key,第二个5是对应的值)
 * 遍历到6的时候,查找另一个数字4是否在数组中是需要常数时间
 * 遍历到1的时候,查找另一个数字9是否在数组中是需要常数时间
 *
 * ......所以一共花费的时间就是一个O(n)
 *
 */
public class HashMapTestHashAgain {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 5);
		if(map.containsKey(1))
			System.out.println(map.get(1));
	}
}
