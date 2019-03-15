package info.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
	List<String> names=Arrays.asList("surendra","sahoo","deepak");
	for (String str : names) {
		System.out.println(str);
	}
	System.out.println("---------------------------------------------");
	names.forEach(name-> System.out.println(name));
	
	System.out.println("---------------------------------------------");
	
	names.stream().filter(name -> name.equals("deepak")).forEach(System.out::println);
	
	System.out.println("---------------------------------------------");
	
	List<Boolean> findFirst = names.stream().map(name -> name.equals("deepak")).collect(Collectors.toList());
	System.out.println(findFirst);
	
	System.out.println("---------------------------------------------");
	}

}
