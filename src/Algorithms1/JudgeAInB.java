package src.Algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * �������a�ﲻ������b�г��ֵ�Ԫ��
 * ����a�е�ÿһ��Ԫ�أ�ȥb�����в鿴�����b��û�еĻ��������
 *
 */
public class JudgeAInB {
    /**
     * ���ֲ��ҷ�
     * @param arr ����
     * @param num ��ֵ
     * @return �ҵ��򷵻�true,���򷵻�false
     */
    static boolean binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int middle = (low + high) >>> 1;
            if (arr[middle] == num)
            {
                return true;
            }
            else if (arr[middle] > num)
            {
                high = middle - 1;
            }else
                low = middle + 1;
        }
        return false;
    }
    /**
     * ע�⣺a������b������
     *
     * ��չ����2����������飬����A�����Ԫ���Ƿ��� B�����г�����û���õ��㷨��
     * �𣺶������ˣ��Ͳ���Ҫ�۰���ô�鷳�ˡ��������鲢������ȥ�룬���㷨����
     *
     * ͻȻ���һ��������鲢������㷨����˵�� �ǲ�����鲢����������ֱ����B�ж�λ��A��λ�ã�
     * �����Ϳ�����O(m+n)��ʵ�֡����Ƚ����⣬˵�����ǰ����������ˣ��㻹�۰���ô�鷳������
     * @param args
     */
    public static void main(String[] args) {
        int[] a = { 1, 3, 0, 19, 4, 2 ,111};
        int[] b = { 10, 19,1,2, 3, 4, 5 };
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (!binarySearch(b, a[i]))
                list.add(a[i]);
        }
        System.out.println("����a��,��������bû�е�Ԫ��:");
        for (int i : list)
            System.out.print(i + " ");
    }

}
