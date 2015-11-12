package src.Algorithms2;

public class MultiArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0] = new int[]{1,2};
		arr[1] = new int[]{3,4};
		arr[2] = new int[]{5,6};

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);

		//我一开始只会这样的
		int[][] a = new int[2][2];
		for(int i = 0;i<a.length;i++){
			for(int j = 0;j<a.length;j++){
				a[i][j] = 1;
				System.out.println(a[i][j]);
			}
		}
	}
}
