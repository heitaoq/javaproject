package src.Algorithms1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * http://tool.oschina.net/apidocs/apidoc?api=jdk-zh
 * HashMap的实现原理
 * http://blog.csdn.net/vking_wang/article/details/14166593#t4
 * http://blog.chinaunix.net/uid-11775320-id-3143919.html
 * http://www.importnew.com/10620.html
 * key的equals()方法用来确保key的唯一性
 * http://developer.51cto.com/art/201210/361755.htm
 * http://blog.csdn.net/liou825/article/details/18375741
 *
 * 2个相等的对象要求返回相等的hashCode
 * 但是2个相等的hashCode不一定对象相等，进而造成冲突,但是Ey.equals("FZ") = false
 * 所以可以靠equals保证key的唯一性
 * String str1 = new String("Ey");
 * String str2 = new String("FZ");
 * System.out.println(str1.hashCode() == str2.hashCode()); //true
 *
 */
public class HashMap_Hashtable {

	public static void main(String[] args) {
		/**
		 * HashMap是非同步的，Hashtable是同步的
		 * 如果多个线程同时访问一个Hash映射，需要保持同步。一般是通过对自然封装该映射对象进行
		 * 同步操作而完成，如Collections.synchronizedMap(new HashMap<String,Integer>())
		 *
		 * HashMap 的实例有两个参数影响其性能：初始容量 和加载因子。容量 是哈希表中桶的数量，初
		 * 始容量只是哈希表在创建时的容量。加载因子 是哈希表在其容量自动增加之前可以达到多满的一
		 * 种尺度。当哈希表中的条目数超出了加载因子与当前容量的乘积时，则要对该哈希表进行 rehash
		 * 操作（即重建内部数据结构），从而哈希表将具有大约两倍的桶数。不进行rehash也是可以的，
		 * 只是这样做的话会加大对象的碰撞记录
		 *
		 * 通常，默认加载因子 (.75) 在时间和空间成本上寻求一种折衷。加载因子过高虽然减少了空间开销，
		 * 但同时也增加了查询成本
		 *
         * 在设置初始容量时应该考虑到映射中所需的条目数及其加载因子，以便最大限度地减少 rehash 操作次数。
		 * 如果初始容量大于最大条目数除以加载因子，则不会发生 rehash 操作。
		 *
		 * 如果很多映射关系要存储在 HashMap实例中，则相对于按需执行自动的 rehash 操作以增大表的容量来说，
		 * 使用足够大的初始容量创建它将使得映射关系能更有效地存储。
		 *
		 * static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
		 * static final float DEFAULT_LOAD_FACTOR = 0.75f;
		 */
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>(128,0.8f);
		hashMap.put("zhang", 1234);
	}
}
