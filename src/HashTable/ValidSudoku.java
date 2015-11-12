package src.HashTable;

import java.util.HashSet;
/**
 * �����ķ���ֵΪboolean��ʱ��,����Ҫ��һ������ȥ����
 * ��������õ���HashSet��Ψһ��������check,��Ϊ�����ǲ����������ͬ��Ԫ�ص�
 * @author Administrator
 *
 */
class SolveValidSudoku{
	public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();
        // Check for each row
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9; j++)
            {
                if (board[i][j] == '.')
                    continue;
                if (!set.contains(board[i][j]))
                    set.add(board[i][j]);
                else
                    return false;
            }
            set.clear();//ÿѭ����һ����Ҫ��set�����,��Ȼ��
        }

    // Check for each column
        for (int j = 0; j < 9; j++) 
        {
            for (int i = 0; i < 9; i++)
            {
                if (board[i][j] == '.')
                    continue;
                if (!set.contains(board[i][j]))
                    set.add(board[i][j]);
                else
                    return false;
              
            }
            set.clear();
        }
    // Check for each sub-grid
        for (int k = 0; k < 9; k++) 
        {
            //���˫��forѭ���ж�һ��С�����Ƿ�Ϸ�
            for (int i = k/3*3; i < k/3*3+3; i++) 
            {
                for (int j = (k%3)*3; j < (k%3)*3+3; j++)
                {
                    if (board[i][j] == '.')
                        continue;
                    if (!set.contains(board[i][j]))
                        set.add(board[i][j]);
                    else
                        return false;
                }
            }
            set.clear();
        }
        return true;
    }
}

public class ValidSudoku {

	public static void main(String[] args) {
		
	}

}
