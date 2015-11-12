package src.TestJDK;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntryTest {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("zhang", 1);
		map.put("ming", 2);
		map.put("lei", 3);

		//entrySet方法返回的是 ：a set view of the mappings contained in this map
		Set<Map.Entry<String, Integer>> setOfMappings = map.entrySet();
		Iterator<?> iterator = setOfMappings.iterator();
		while (iterator.hasNext()){
			Entry<?,?> entry = (Entry<?, ?>) iterator.next();
			if(entry.getKey() == "zhang")
				System.out.println("张在班级里排名是 ：" + entry.getValue());
		}
	}
}
