package src.Algorithms3;

/**
 * String里面没有reverse方法
 * StringBuilder和StringBuffer里面都有
 * @author Administrator
 *
 */
public class StringReverseAPITest {
	public static void main(String[] args) {
		String str = "abcde";
		StringBuilder sb = new StringBuilder("abcd");
		sb.reverse();
		System.out.println(sb);
		StringBuffer sbu = new StringBuffer("abcd");
		sbu.reverse();
		System.out.println(sbu);
	}
}