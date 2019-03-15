package info.Intstream;

import java.util.Arrays;
import java.util.List;

public class Reducefun {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(4,6,8,2,9);
		Integer reduce = values.stream().reduce(10, (a,b)-> a+b);
		System.out.println(reduce);

	}

}
