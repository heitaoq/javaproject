package src.Algorithms2;

import java.util.ArrayList;
/**
 * ��������������ҹ��ɣ����ɺܼ򵥣�һ������£���ȥ�߽磩ĳһ�е�i����������һ�е�i-1��+��i��
 * 
 *	 [
 *		     [1],
 *		    [1,1],
 *		   [1,2,1],
 *		  [1,3,3,1],
 *		 [1,4,6,4,1]
 *	 ]
 * 
 * @author Administrator
 *
 */
class SolvePascalsTriangle {
	 public ArrayList<ArrayList<Integer>> generate(int numRows) {
		 
		 	//�������ݽṹ,�������
		 	ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
	        if(numRows == 0)
	        	return triangle;
	        
	        //ֻ��һ��Ԫ�ص�ArrayList<ArrayList<Integer>>---������3�д���������ζ��ᱻִ�е�
	        ArrayList<Integer> level1 = new ArrayList<Integer>();
	        level1.add(1);
	        triangle.add(level1);
	        
	        if(numRows == 1){
	            return triangle;
	        }
	        //���������������1��
	        ArrayList<Integer> level2 = new ArrayList<Integer>();
	        level2.add(1);     
	        level2.add(1);     
	        triangle.add(level2);
	        
	        if(numRows == 2){
	            return triangle;
	        }
	        
	        //���������������2
	        if(numRows > 2)
	        {
	            for(int i = 2; i < numRows; ++i)//�ӵ�3�п�ʼ 0 1 2
	            {
	                ArrayList<Integer> list = new ArrayList<Integer>();
	                list.add(1);//���ȸ���Ԫ�ؼ���1
	                //ѭ����ӡÿһ��Ԫ��
	                for(int j = 0; j < i - 1; ++j)
	                {
	                    Integer value1 = triangle.get(i - 1).get(j);//�ؼ�����,��һ��get�������ص���ArrayList<Integer>,�ڶ���get�������ص��� 
	                    Integer value2 = triangle.get(i - 1).get(j + 1);
	                    
	                    int value = value1.intValue() + value2.intValue();
	                    list.add(new Integer(value));
	                } 
	                  list.add(new Integer(1));
	                  triangle.add(list);
	            }
	        }
	        return triangle;
	    }
}

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolvePascalsTriangle s = new SolvePascalsTriangle();
		ArrayList<ArrayList<Integer>> res = s.generate(3);
		for(ArrayList<Integer> a : res)
		{
			System.out.println(" "+ a);
		}
			
	}

}






