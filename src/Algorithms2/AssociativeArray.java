package src.Algorithms2;

public class AssociativeArray<K,V> {
	private Object[][] pairs;
	private int index;
	public AssociativeArray(int length){
		pairs = new Object[length][2];
	}
	/**
	 * 注意,这里不能采用双层循环对2维数组进行赋值,而是要new一个一维数组进行赋值
	 * @param key
	 * @param value
	 */
	public void put(K key,V value){
		if(index >= pairs.length)
			throw new ArrayIndexOutOfBoundsException();
		//那么pairs[0]就是第一个元素。。。然后这个第一个元素里面含有key 和value 2个值
		pairs[index++] = new Object[]{key,value};
	}
	public V get(K key){
		for(int i = 0;i<index;i++){
			if(key.equals(pairs[i][0]))
				return (V)pairs[i][1];
		}
		return null;
	}

	public static void main(String[] args) {
		AssociativeArray<String, Integer> map = new AssociativeArray<String, Integer>(3);//HashMap可以装元素的数量
		map.put("Tom", 25);
		map.put("Bruse", 21);
		map.put("Mary", 36);
		System.out.println(map.get("Mary"));
		System.out.println(map.get("Bruse"));

		Object[] params = new Object[]{1,2,3};
		for(Object a:params)
			System.out.println(a);

	}
}
