package info.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DebugStream {

	public static void main(String[] args) {
		List<String> debug = Arrays.asList("bombay", "bangalore", "bombay", "hyderabad", "chennai", "mysore",
				"bangalore", "bangalore");

		List<String> collect = debug.stream().filter(text -> text.startsWith("b"))
				.map(txt -> txt.substring(0, txt.length())).distinct().sorted().collect(Collectors.toList());

		System.out.println(collect);
	}

}
