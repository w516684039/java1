package j1128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class test1 {
	public static void main(String[] args){
		Map<String, String  > map  = new HashMap<String ,String >();
		map.put("wkz", "王坤志");
		map.put("ljt", "林家腾");
		String value1 =map.get("ljt");
		System.out.println(value1);
		System.out.println("----------");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
			
		}
		System.out.println("----------");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(value);
			
		}
	}

}
