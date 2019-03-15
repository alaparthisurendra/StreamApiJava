package info.MapandFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinctwords {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Surendra", "deepak", "venkat", "surendra", "sahoo", "Sahoo", "deepak",
				"Venkat", "SUREndra");

		List<String> collect = words.stream().flatMap(word -> Stream.of(word.split(","))).distinct()
				.collect(Collectors.toList());

		System.out.println(collect);

		System.out.println("------------all converting lower case----------------------");
		
		
		List<String> uniquewords = words.stream().map(String::toLowerCase)
				.flatMap(phrase -> Stream.of(phrase.split(","))).distinct().sorted().collect(Collectors.toList());
		uniquewords.forEach(System.out::println);
	}

}
