package src.HashTable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfTimes {
	
	/**
	 * public final String toString() {
            return getKey() + "=" + getValue();
        }
	 * @param arr
	 * @return
	 */
	public Map<Integer, Integer> toSumNumber(int[] arr){
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		Integer count = 0;//�ŵ����棬�Ͳ���ÿ����ջ��������
		for(int i = 0;i<arr.length;i++){
			count = map.get(arr[i]);
			map.put(arr[i], count == null? 1 : ++count);
		}
		return map;
	}
	
	/**
	 * ���֪�����ַ�Χ,�������������±�,Ȼ������ֵ�����,�����һ����򵥵�Hash��
	 * @param args
	 */
	public int[] toSumNumberTimes(int[] arr){
		int[] newArray = new int[5];
		for(int i = 0;i<arr.length;i++){
			newArray[arr[i]]++;
		}
		return newArray;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0,0,1,2,2,2,2,2,3,3,3,3,4};
		System.out.println(new NumberOfTimes().toSumNumber(arr));
		for(int a:new NumberOfTimes().toSumNumberTimes(arr)){
			System.out.println(a);
		}
		
	}

}
