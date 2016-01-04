package src.Algorithms1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * http://tool.oschina.net/apidocs/apidoc?api=jdk-zh
 * HashMap��ʵ��ԭ��
 * http://blog.csdn.net/vking_wang/article/details/14166593#t4
 * http://blog.chinaunix.net/uid-11775320-id-3143919.html
 * http://www.importnew.com/10620.html
 * key��equals()��������ȷ��key��Ψһ��
 * http://developer.51cto.com/art/201210/361755.htm
 * http://blog.csdn.net/liou825/article/details/18375741
 *
 * 2����ȵĶ���Ҫ�󷵻���ȵ�hashCode
 * ����2����ȵ�hashCode��һ��������ȣ�������ɳ�ͻ,����Ey.equals("FZ") = false
 * ���Կ��Կ�equals��֤key��Ψһ��
 * String str1 = new String("Ey");
 * String str2 = new String("FZ");
 * System.out.println(str1.hashCode() == str2.hashCode()); //true
 *
 */
public class HashMap_Hashtable {

	public static void main(String[] args) {
		/**
		 * HashMap�Ƿ�ͬ���ģ�Hashtable��ͬ����
		 * �������߳�ͬʱ����һ��Hashӳ�䣬��Ҫ����ͬ����һ����ͨ������Ȼ��װ��ӳ��������
		 * ͬ����������ɣ���Collections.synchronizedMap(new HashMap<String,Integer>())
		 *
		 * HashMap ��ʵ������������Ӱ�������ܣ���ʼ���� �ͼ������ӡ����� �ǹ�ϣ����Ͱ����������
		 * ʼ����ֻ�ǹ�ϣ���ڴ���ʱ���������������� �ǹ�ϣ�����������Զ�����֮ǰ���Դﵽ������һ
		 * �ֳ߶ȡ�����ϣ���е���Ŀ�������˼��������뵱ǰ�����ĳ˻�ʱ����Ҫ�Ըù�ϣ����� rehash
		 * ���������ؽ��ڲ����ݽṹ�����Ӷ���ϣ�����д�Լ������Ͱ����������rehashҲ�ǿ��Եģ�
		 * ֻ���������Ļ���Ӵ�������ײ��¼
		 *
		 * ͨ����Ĭ�ϼ������� (.75) ��ʱ��Ϳռ�ɱ���Ѱ��һ�����ԡ��������ӹ�����Ȼ�����˿ռ俪����
		 * ��ͬʱҲ�����˲�ѯ�ɱ�
		 *
         * �����ó�ʼ����ʱӦ�ÿ��ǵ�ӳ�����������Ŀ������������ӣ��Ա�����޶ȵؼ��� rehash ����������
		 * �����ʼ�������������Ŀ�����Լ������ӣ��򲻻ᷢ�� rehash ������
		 *
		 * ����ܶ�ӳ���ϵҪ�洢�� HashMapʵ���У�������ڰ���ִ���Զ��� rehash ������������������˵��
		 * ʹ���㹻��ĳ�ʼ������������ʹ��ӳ���ϵ�ܸ���Ч�ش洢��
		 *
		 * static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
		 * static final float DEFAULT_LOAD_FACTOR = 0.75f;
		 */
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>(128,0.8f);
		hashMap.put("zhang", 1234);
	}
}
