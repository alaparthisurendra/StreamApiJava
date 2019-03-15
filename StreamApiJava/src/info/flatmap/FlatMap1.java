package info.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FlatMap1 {

	public static void main(String[] args) {
		String[] words= {"surendra","aaabbccded"};
		Stream<String> stream = Arrays.stream(words);
		List<String> collect = stream.map(s->s.split("")).flatMap(Arrays::stream).distinct().
		collect(Collectors.toList());
		
		collect.forEach(System.out::println);

}
}