package src.Algorithms1;

public class EffectiveMaxMinInArray {

	/**
	 * �����㷨,��N������������ֵMax����СֵMin,����ֻ��Ҫ���N/2������Min��Max,Ȼ��ȡ��С��Min,�ϴ��Max����
	 * @param arr
	 * @param a
	 * @param b
	 * @return
	 */
	int[] search(int[] arr,int a,int b){
		int[] max_min = new int[2];
		/**
		 * �ݹ�ĳ��� ���� 1 & 2 �� max = 2 min = 1
		 */
		if(b-a <= 1)
		{
			if(arr[a] > arr[b]){
				max_min[0] = arr[a];
				max_min[1] = arr[b];
				return max_min;
			}else{
				max_min[0] = arr[b];
				max_min[1] = arr[a];
				return max_min;
			}
		}
		int[] a1 = new int[2];
		int[] a2 = new int[2];
		/**
		 * ���� a = 1,b = 4
		 * ��    a1 = search(arr,1,2)
		 * 	   a2 = search(arr,3,4)
		 */
		a1 = search(arr, a, a + (b-a)/2);
		a2 = search(arr, a + (b-a)/2+1,b);
		int a1_max = a1[0];
		int a1_min = a1[1];
		int a2_max = a2[0];
		int a2_min = a2[1];
		int[] a3 = new int[2];
		/**
		 * �ϴ�����ͽϴ�����Ƚ�,��С�����ͽ�С�����Ƚ�  2�ξͿ�����
		 */
		if(a1_max > a2_max){
			a3[0] = a1_max;
		}else{
			a3[0] = a2_max;
		}
		if(a1_min < a2_min){
			a3[1] = a1_min;
		}else{
			a3[1] = a2_min;
		}
		return a3;
	}
	/**
	 * ��Ҫѡ���ӵ����������㷨����,ѡ�򵥵ľͺ�
	 * 			4 3 2 1
	 * 		4 3			2 1
	 * 		max = 4		max = 2
	 * 		min = 3		min = 1
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {4,3,2,1,-9,90};
		for(int a:new EffectiveMaxMinInArray().search(arr, 0, arr.length-1)){
			System.out.println(a+" ");
		}
	}
}
