package info.StreamApi;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekandSkip {

	public static void main(String[] args) {
   
	/*	Stream.of("surendra","sahoo","deepak").filter(obj-> obj.equals("surendra")).
		collect(Collectors.toList());*/

		
		Stream.of("surendra","sahoo","deepak").filter(obj-> !obj.equals("deepak")).
		peek(obj-> System.out.println("peek value:" +obj)).collect(Collectors.toList());
		
		IntStream.of(1804,36,72,48).skip(2)
		.filter(val-> val> 24).forEach(i-> System.out.println(i));
	}

}
