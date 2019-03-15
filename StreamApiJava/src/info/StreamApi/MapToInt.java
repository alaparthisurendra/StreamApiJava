package info.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToInt {

	public static void main(String[] args) {
		User u1 = new User(24, "surendra");
		User u2 = new User(25, "sahoo");
		User u3 = new User(27, "deepak");
		List<User> alluser = new ArrayList<>();
		alluser.add(u1);
		alluser.add(u2);
		alluser.add(u3);

		// alluser.stream().map(user-> user.getAge() > 24).forEach(System.out::println);

		List<User> collect = alluser.stream().filter(age -> age.getAge() > 24).collect(Collectors.toList());
		System.out.println(collect);

		System.out.println("----------------------------------------");

		alluser.stream().map(age -> age.getAge() <= 26).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("----------------------------------------");

		/*
		 * int sum = alluser.stream().mapToInt(user ->{ return user.getAge(); }).sum();
		 * System.out.println(sum);
		 */

		long count = alluser.stream().map(User::getAge).filter(age -> age > 24).count();
		System.out.println(count);

		System.out.println("----------------------------------------");

		int sum = alluser.stream().mapToInt(User::getAge).sum();
		System.out.println(sum);
		System.out.println("----------------------------------------");

		Stream<Integer> sorted = alluser.stream().map(User::getAge).filter(age -> age >= 25).sorted();
		List<Integer> collect2 = sorted.collect(Collectors.toList());
		collect2.forEach(System.out::println);
		
		System.out.println("----------------------------------------");

	     System.out.println(collect2.get(0));
	     
	 	System.out.println("----------------------------------------");
	 	
	 	long count2 = alluser.stream().mapToInt(User::getAge).filter(age -> age >=25).count();
	 	System.out.println(count2);
	}

	static class User {
		private Integer age;
		private String name;

		public User() {
			super();
		}

		public User(Integer age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "User [age=" + age + ", name=" + name + "]";
		}

	}
}