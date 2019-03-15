package info.Intstream;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		
   long count = IntStream.range(0, 15).filter(i -> i%2==0).count();
   System.out.println(count);
   
	}

}
