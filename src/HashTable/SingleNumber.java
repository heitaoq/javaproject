package src.HashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class SolveSingleNumber{
	/**
	 * 0^1 = 1
	 * 0^0 = 0
	 * a^a = 0
	 * 1^1 = 0
	 * 0^a = a
	 * @param A
	 * @return
	 */
	 public int singleNumber(int[] A) {
	        int x = 0;
	        for(int i=0;i < A.length;i++)
	        {
	            x = x^A[i];
	        }
	        return x;
	    }
	
	 //????????
	 public int singleNumber_1(int[] A) 
	 {
	      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	      //????????§Ö????›¥??HashMap?????,???:?????????
	      int i = 0;
	      for(;i<A.length;i++)
	      {
	          map.put(i,A[i]);
	      }
	      i = 0;
	      //??????????HashMap,???????????HashMap
	      HashMap<Integer,Integer> map_1 = new HashMap<Integer,Integer>();
	      for(;i<A.length;i++)
	      {
	          if(map.containsValue(A[i]))
	          {
	              int a = map.get(i);
	              if(!map_1.containsKey(a))
	              {
	                    map_1.put(a,i);   
	              }
	              else
	              {
	                  map_1.remove(a);//??????????????????????????????map??????????remove??
	              }
	          }
	      }
	      Set<Integer> s = map_1.keySet();
	      Iterator<Integer> it = s.iterator();
	      int c = it.next();
	      return c;  
	    }
	 
	 //??§Ô??
	 public int singleNumber_2(int[] A) 
	    {
	      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	      for(int i = 0;i<A.length;i++)
	      {
	         if(!map.containsKey(A[i])) 
	         {
	            map.put(A[i],i);   
	         }
	         else
	         {
	            map.remove(A[i]);//????????§Ú?? map.remove(A[i]);????????§Ö?,???????????int a = ???????????????
	         }
	      }
	      Set<Integer> s = map.keySet();
	      Iterator<Integer> it = s.iterator();
	      int c = it.next();
	      return c;  
	    }
	 
}

public class SingleNumber {
	public static void main(String[] args) {
		SolveSingleNumber s = new SolveSingleNumber(); 
		int[] arr = {1,1,2,2,3};
		System.out.println(s.singleNumber(arr));
		
	}
}



