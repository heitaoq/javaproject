package src.Algorithms3;

/**
 * 算法之道 内循环里的语句执行的次数
 * @author Administrator
 *
 */
public class ToSumCountIn2For {
	public static void main(String[] args) {
		int count = 0;
		int count1 = 0;
		for(int i = 1;i<=16;i*=2){
			for(int j = 1;j<=i;j++){
				count++;
			}
		}
		System.out.println(count);
		/**
		 * 普遍的情况就为2个下标的乘积即可
		 */
		for(int i = 0;i<16;i++){
			for(int j = 0;j<16;j++){
				count1++;
			}
		}
		System.out.println(count1);
	}
}
