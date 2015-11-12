package src.Algorithms2;

public class SplitTest {
	public static void main(String[] args) {
		String str = "I have a dream! Hello World Hello World";
		String[] strArray = str.split(" ");
		for(String s : strArray)
			System.out.println(s+" ");
	}
}
