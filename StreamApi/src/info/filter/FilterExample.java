package info.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("surendra", "sahoo", "naveen", "deepak", "Irrapa", "uday", "deepak sd");
		/*
		 * for (String s : names) { if(!s.equals("surendra")) System.out.println(s); }
		 */

		names.stream().filter(name -> name.length() >= 5).forEach(len -> System.out.println(len));

		System.out.println("----------------------");
		names.stream().filter(new Predicate<String>() {
			public boolean test(String name) {
				return name.equals("sahoo");
			}
		}).forEach(System.out::println);
		System.out.println("----------------------");

		names.stream().filter(na -> na.equals("surendra")).forEach(System.out::println);
		System.out.println("====-------------+=======------------------");

		names.stream().filter(FilterExample::isNaveen).forEach(System.out::println);

	}

	private static boolean isNaveen(String na) {
		return na.equals("naveen");
	}

}
