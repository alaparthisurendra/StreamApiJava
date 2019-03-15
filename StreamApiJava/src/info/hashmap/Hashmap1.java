package info.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hashmap1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hashMap=new HashMap<>();
		hashMap.put(1, "surendra");
		hashMap.put(2, "alaparthi");
		hashMap.put(3, "sahoo");
		hashMap.put(4, "deepak");
		hashMap.put(6, "rohit");
		hashMap.put(5, "venakt");
		
		Map<Integer, String> filtered = getFilteredMap(hashMap,"s");
		System.out.println(filtered);
		
		List<Entry<Integer, String>> streamFilterMap = getStreamFilterMap(hashMap,"s");
		System.out.println(streamFilterMap);
		
	}


	private static Map<Integer, String> getFilteredMap(Map<Integer, String> hashMap, String string) {
		Map<Integer, String> result=new HashMap<>();
		
		for(Map.Entry<Integer, String> val: hashMap.entrySet())
		{
			if(val.getValue().startsWith("s"))
			{
				result.put(val.getKey(), val.getValue());
			}
		}
		return result;
		
	}
	
	
	
	private static List<Entry<Integer, String>> getStreamFilterMap(Map<Integer, String> hashMap, String string) {
		
		Stream<Entry<Integer, String>> stream = hashMap.entrySet().stream();
		
	   List<Entry<Integer, String>> values = stream.filter(val-> val.getValue().
			   startsWith("d")).collect(Collectors.toList());
		
	   //collect.forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
	     return values;
		
	}

	


}
