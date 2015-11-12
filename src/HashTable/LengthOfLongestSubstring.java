package src.HashTable;

import java.util.HashMap;

class SolveLengthOfLongestSubstring{
	 /*
     * The first solution is like the problem of "determine if a string has all unique characters" in CC 150. 
     * �ж�һ���ַ����Ƿ����ظ����ַ���CC150�������Ŀ
     * We can use a flag array to track the existing characters for the longest substring without repeating characters.
    */
    public int lengthOfLongestSubstring_Method2(String s) {
        
        boolean[] flag = new boolean[256];
        int result = 0;
        int j = 0;
        char[] arr = s.toCharArray();
    
        for (int i = 0; i < arr.length; i++)//�����ַ�����
        {
   		char c = arr[i];
   		if (flag[c])
   		{
   			result = Math.max(result, i - j);
   			for (int k = j; k < i; k++)
   			{
   				if (arr[k] == c)
   				{
   					j = k + 1;
   					break;
   				}
   				flag[arr[k]] = false;
   			}	
   		} 
   		else
   		{
   			flag[c] = true;
   		}
   	}
   	result=Math.max(arr.length-j,result);
   	return result;
   }
	
	 /**
	  * The basic idea is using a hash table to track existing characters and their position. 
	  * When a repeated character occurs, check from the previously repeated character. However, 
	  * the time complexity is higher - O(n^3).
	  * @param s
	  * @return
	  */
	 //��ʱ��
	 public int lengthOfLongestSubstring(String s) 
	    {
	        char[] arr = s.toCharArray();
	    	int pre = 0;
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    	for (int i = 0; i < arr.length; i++) //����ʱ��
	    	{
			    if (!map.containsKey(arr[i])) //�����Ҫ����ʱ��
			    {
	    			map.put(arr[i], i);
	    		} 
	    		else
	    		{
	    			pre = Math.max(pre, map.size());
	    			i = map.get(arr[i]);//�õ���һ����ͬ�ַ���λ��
	    			map.clear();//Ҳ��Ҫ����ʱ��
	    			
		    	}
	    	}
		        return Math.max(pre, map.size());//Ϊʲô�����Ҫѡ��2������,����Ϊ�˷�ֹ���һ���Ӵ����ַ��������λ�ó���,�Ӷ������޷�����else�����ж�
	    }
	/*
	 public int lengthOfLongestSubstring(String s) 
	    {
	        HashSet<Character> set = new HashSet<Character>();
	        int max = 0; //��¼�����ַ�������
	        char[] c = s.toCharArray();
	        for(int i =0;i<c.length;i++)
	        {
	            if(!set.contains(c[i]))
	                set.add(c[i]);
	            else
	            {
	                if(set.size()>max)
	                    max = set.size();
		                set.clear();
		                i--; 
		                     ����д��i--,�����Ŀ������HashSet����,һ�������ظ����ַ�,����Ҫȥset���������ҵ�ͬ�����ַ���λ��,�����ǵ�����--
		                     ����wlrbbmqbhcdarz ��ȷ���Ƿֽ��������wlrb b mqbhcdarz ������ wlrb bmq bhcdarz
	            }
	        }
	        return (max>set.size()? max:set.size());    
	    }
	    */
}
public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		String str = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco";
		SolveLengthOfLongestSubstring s = new SolveLengthOfLongestSubstring();
	 	System.out.println(s.lengthOfLongestSubstring(str));
	}

}
