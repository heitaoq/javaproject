package src.Algorithms2;

import java.util.Arrays;
/**
 * 编程之美,快速寻找满足条件的2个数
 * 点评：面试中很多题目都是给定一个数组,要求返回2个下标的(比如找2个元素,或者找一个子数组)
 * 而相应比较高效的解法则是先排序,然后在一个循环体里用2个变量进行反向的遍历
 * @author Administrator
 *
 */
public class FindTwoNumberEqualsOneNumber {

	public boolean find(int[] arr,int value){
		if(arr == null)
			throw new NullPointerException();
		//要先排序
		Arrays.sort(arr);
		System.out.println(arr[0] + ","+arr[1]);
		int i = 0;
		int j = arr.length - 1;
		for(;i<j;){
			if(arr[i]+arr[j] == value){
				return true;
			}else if(arr[i]+arr[j]<value){
				i++;
			}else{
				j--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		FindTwoNumberEqualsOneNumber f = new FindTwoNumberEqualsOneNumber();
		int[] arr = {5,6,1,4,7,9,9,8};
		int value = 18;
		System.out.println(f.find(arr, value));
	}
}
