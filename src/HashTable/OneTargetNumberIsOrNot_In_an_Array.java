package src.HashTable;

import java.util.Arrays;

class SolveOneTargetNumberIsOrNot_In_an_Array
{
	public boolean twoSum(int[] arr,int target)
	{
		Arrays.sort(arr);
		for(int i =0,j=arr.length-1 ; i<j;)
		{
			if(arr[i] + arr[j] == target)
				return true;
			else if(arr[i] + arr[j] > target)
				j--;
			else
				i++;
		}
		return false;
	}
}

public class OneTargetNumberIsOrNot_In_an_Array {
	public static void main(String[] args) {
		int[] arr = {11,15,2,7};
		int target = 28;
		SolveOneTargetNumberIsOrNot_In_an_Array s = new SolveOneTargetNumberIsOrNot_In_an_Array();
		System.out.println(s.twoSum(arr, target));
	}
}
