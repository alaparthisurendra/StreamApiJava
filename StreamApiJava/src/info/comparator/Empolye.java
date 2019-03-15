package info.comparator;

public class Empolye {
	
	private String name;
	private Integer age;
	private String salary;
	private String experience;
	private String company;
	public Empolye() {
		super();
	}
	public Empolye(String name, Integer age, String salary, String experience, String company) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.experience = experience;
		this.company = company;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Empolye [name=" + name + ", age=" + age + ", salary=" + salary + ", experience=" + experience
				+ ", company=" + company + "]";
	}
	

}
