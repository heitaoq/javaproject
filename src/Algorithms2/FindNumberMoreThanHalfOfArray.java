package src.Algorithms2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindNumberMoreThanHalfOfArray {
	/**
	 * ����һ,����HashMapͳ��ÿ�����ֳ��ֵĴ���,Ȼ����......
	 * @param num
	 * @return
	 */
	public int majorityElement0(int[] num) {
		int result = 0;
        if (num == null)
            throw new NullPointerException();
        if(num.length == 1) {
			return num[0];
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < num.length; i++) {
			if(map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i]) + 1);
			} else {
				map.put(num[i], 1);
			}
		}
        // Traverse array and get every item's count.
        for (int i = 0 ; i < num.length ; i++) {
            int value = map.get(num[i]);
            if (value > num.length / 2) {
                result = num[i];
            }
        }
        return result;
	}
	/**
	 * �˷������հ�,��������г��ֵ����ֳ����������е�һ��Ļ�,��ô�м�ֵһ����������Ҫ������
	 * �Ȱ��������һ������ͺã�ǰ�����������ȷʵ����
	 * @param num
	 * @return
	 */
	public int majorityElement(int[] num) {
		Arrays.sort(num);
		return num[num.length/2];
	}
	public static void main(String[] args) {
		FindNumberMoreThanHalfOfArray f = new FindNumberMoreThanHalfOfArray();
		int[] arr = {1,2,2,4,4,4,4,4,4,4,2};
		System.out.println(f.majorityElement(arr));
		System.out.println(f.majorityElement0(arr));
	}
}
