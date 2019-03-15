package info.Intstream;

import java.util.Arrays;
import java.util.List;
//A number which is divisible by itself is called prime number.
public class PrimeNo {

	public static void main(String[] args) {
	List<Integer>pnum=Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,17);
	//pnum.stream().filter(i-> i > 5).forEach(System.out::println);
	System.out.println("-----------------------");
	
	pnum.stream().filter(PrimeNo::isPrime).forEach(i->System.out.println(i));
	}
	
	public static boolean isPrime(int number)
	{
		for(int i=2; i<=number/2; i++)
		{
			System.out.println("number:"+number);
			if(number %i ==0)
			{
				return false;
			}
		}
		return true;
		
	}

}
