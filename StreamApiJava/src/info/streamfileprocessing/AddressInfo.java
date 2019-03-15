package info.streamfileprocessing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddressInfo {

	public static void main(String[] args) {
		List<Address> address=new ArrayList<>();
		address.add(new Address("6-112/66","Marathahali","karnataka","560037"));
		address.add(new Address("95/457","Nagawara","karnataka","560045"));
		address.add(new Address("12/25","munnekolala ","karnataka","560036"));
		address.add(new Address("6-112/1","marathahali","karnataka","560037"));
		
		List<String> collect = address.stream().map(Address:: getColony).filter(colony->
		colony.equals("marathahali")).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		System.out.println("-------------------------------");
		
		Comparator<Address> comparing = Comparator.comparing(Address::getPinCode, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(address, comparing);
		address.forEach(ad-> System.out.println(ad.getColony()+"== "+ ad.getHno()+" ==="+ad.getState()));
	}

}
