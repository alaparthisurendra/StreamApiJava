package info.MapandFlatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Parcel {

	private String name;
	private List<String> items;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public Parcel() {
	}

	
	/*public Parcel(String name, List<String> items) {
		super();
		this.name = name;
		this.items = items;
	}
*/
	public Parcel(String name, String... items) {
		super();
		this.name = name;
		// this.items = items;
		this.items = Arrays.asList(items);
	}

	public static void main(String[] args) {
		Parcel amazon = new Parcel("Amazon", "Laptop", "mobile", "charger");
		Parcel jabong=new Parcel("jabong","uspolo Pant","wallet","T-shirt");
		Parcel flipkart=new Parcel("FlipKart","nike sneakers","sandals","Track pant");
		
		// This method takes the array a which is required to be converted into a List.
		List<Parcel> asList = Arrays.asList(amazon,jabong,flipkart);
		
		System.out.println("----------------------without using flatmap--------------------");
		
		List<List<String>> collect = asList.stream().map(Parcel:: getItems).
				collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("---------------------- using flatmap--------------------");
		
		List<String> collect2 = asList.stream().map(Parcel::getItems).
				flatMap(Collection ::stream).
				collect(Collectors.toList());
		
		collect2.forEach(System.out::println);
	}

}
