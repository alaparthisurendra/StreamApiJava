package info.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapperExample {
	public static void main(String[] args)
	{
		List<String> allNames=Arrays.asList("surendra","jagdeesh","sandeep");
		allNames.stream().filter(name -> name.equals("surendra")).forEach(System.out::println);
		System.out.println("============================================");
		
		allNames.stream().filter(names-> names.equals("jagdeesh")).map(new Function<String, user>() {
			public user apply(String name)
			{
				user user=new user(name,24);
				return user;
			}
		}).forEach(System.out::println);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		allNames.stream().filter(nam->nam.equals("sandeep")).map(n-> new user("sandeep",27)).forEach(System.out::println);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		List<user> list = allNames.stream().filter(nam->nam.equals("sandeep")).map(n-> new user("sandeep",27)).collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}

class user{
	private String name;
	private Integer age;
	
	public user(){
	}
	
	public user(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "user [name=" + name + ", age=" + age + "]";
	}
	
}