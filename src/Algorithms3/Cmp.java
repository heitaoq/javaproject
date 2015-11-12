package src.Algorithms3;

public class Cmp {
	public int cmp(char[] source,char[] target)
	{
		int sourceLength = source.length;
		int targetLength = target.length;
		int max = sourceLength - targetLength +1;
		char first = target[0];
		for(int i = 0;i<max;i++)
		{
			//find the first char
			if(source[i] != first)
			{
				while(++i<max && source[i] != first);
			}
			//found the first char
			System.out.println("first:"+first);
			if(i<max)
			{
				int j = i+1;
				int end = j + targetLength -1;
				int k;
				for(k = 1;j<end && source[j] == target[k];j++,k++);
				if(j==end)//OK
				{
					return i;
				}
/*				else 
				{
					int move = k;
					i +=  move;
				}*/
			}
		}
		return -1;
	}
	public static void main(String [] args)
	{
		Cmp c = new Cmp();
		String str1 = "asdfggh";
		String str2 = "ggh";
		System.out.println(c.cmp(str1.toCharArray(),str2.toCharArray()));
	}
}

