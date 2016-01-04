package src.HashTable;

import java.util.HashMap;
import java.util.Map;

public class JudgeNumInArrayEquals {

	/**
	 * �ж�һ����������������Ƿ����
	 *  0^a = a
	 *  ����Щ���ַ��뵽HashMap����,ͳ�Ƴ��ֵĴ���
	 * @param arr
	 * @return
	 */
	public boolean judge(int[] arr){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		int count = map.get(arr[0]);
		if(count == arr.length)
			return true;
		else
			return false;
	}
	/**
	 * ѡ��������ĵ�һ��Ԫ����Ϊ���,Ȼ��Ѻ�����������κ͸ո�ѡ�����ֽ��бȽ�
	 * @param arr
	 * @return
	 */
	public boolean judge1(int[] arr){
		int first = arr[0];
		int i = 0;
		for(;i<arr.length;i++){
			if(first == arr[i])
				continue;
			else
				break;
		}
		if(i == arr.length)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int[] arr = {5,5,5,5,5,5,1};
		System.out.println(new JudgeNumInArrayEquals().judge(arr));
		System.out.println(new JudgeNumInArrayEquals().judge1(arr));
	}
}
