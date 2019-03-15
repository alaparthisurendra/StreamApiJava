package info.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Flatmap {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List<String> allCities=Arrays.asList("hyderabad","chennai","bangalore","mumbai","pune");
		allCities.stream().map(s->s.equals("pune")).forEach(System.out::println);*/
		
		System.out.println("---------------------------------------------------");
		
		List<User> allusers=Arrays.asList(
				new User(24,"surendra",Arrays.asList("7358456712","8838223993")),
				new User(25,"sahoo",Arrays.asList("88888888","77777777")),
				new User(24,"venkat",Arrays.asList("999988888","77778888")),
				new User(27,"deepak",Arrays.asList("874444","999999999"))
				);
		
		Optional<String> findAny = allusers.stream().map(user-> user.getPhNumbers().stream())
		.flatMap(phno-> phno.filter(ph-> ph.equals("7358456712"))).findAny();
		
		System.out.println(findAny);
	
		findAny.ifPresent(phno->System.out.println(phno));
		System.out.println("---------------------------------------------------");
		findAny.ifPresent(System.out::println);
		System.out.println("---------------------------------------------------");
		boolean present = findAny.isPresent();
		System.out.println(present);
		System.out.println("**---------------------------------------------------**");
		
		/*Optional<Stream<String>> findAny2 = allusers.stream().map(user-> user.getPhNumbers().
				stream()).map(ph-> ph.filter(num-> num.equals("8838223993"))).findAny();
		
		 findAny2.ifPresent(System.out::println);*/
	}
	static class User {
		private Integer age;
		private String name;
		private List<String> phNumbers;
		
		public User() {
			super();
		}

		public User(Integer age, String name, List<String> phNumbers) {
			super();
			this.age = age;
			this.name = name;
			this.phNumbers = phNumbers;
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

		public List<String> getPhNumbers() {
			return phNumbers;
		}

		public void setPhNumbers(List<String> phNumbers) {
			this.phNumbers = phNumbers;
		}

		
	}

}
