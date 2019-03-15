package info.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>all=Arrays.asList("surendra","deepak","sahoo","naveen",
				"venkatswamy","shashidhar");
		
		List<String> collect = all.stream().map(String::toUpperCase).collect(Collectors.toList());
       collect.forEach(System.out::println);
	}

}
