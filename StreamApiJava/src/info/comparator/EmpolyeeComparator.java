package info.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpolyeeComparator {

	public static void main(String[] args) {
		Empolye e = new Empolye("surendra", 24, "4.5", "3.1", "ltts");
		Empolye e1 = new Empolye("SUrendra", 24, "4.5", "3.1", "ltts");
		Empolye e2 = new Empolye("Deepak", 27, "5.5", "4.3", "ltts");
		Empolye e3 = new Empolye("sahoo", 25, "4.5", "3.5", "ltts");
		Empolye e4 = new Empolye("navven", 27, "6.5", "4.6", "ltts");

		List<Empolye> allEmpolyes = new ArrayList<>();
		allEmpolyes.add(e);
		allEmpolyes.add(e1);
		allEmpolyes.add(e2);
		allEmpolyes.add(e3);
		allEmpolyes.add(e4);
		allEmpolyes.forEach(System.out::println);
		System.out.println("-------------------------");
		
		Comparator<Empolye> comparing = Comparator.comparing(Empolye::getAge);
		Collections.sort(allEmpolyes, comparing);
		allEmpolyes.forEach(emp -> System.out.println(emp));
		
		System.out.println("-------------------------");
		
		Comparator<Empolye> comparing2 = Comparator.comparing(Empolye::getName, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(allEmpolyes, comparing2);
		allEmpolyes.forEach(System.out::println);
		
		System.out.println("-------------------------");
		Comparator<Empolye> comparing3 = Comparator.comparing(Empolye::getSalary, String.CASE_INSENSITIVE_ORDER).reversed();
		Collections.sort(allEmpolyes, comparing3);
		//allEmpolyes.forEach(System.out::println);
		allEmpolyes.stream().forEach(System.out::println);// @formatter:off
		 
		// @formatter:on


	}

}
