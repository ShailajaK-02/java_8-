package StreamApiQBint;

import java.util.Arrays;
import java.util.List;

// 7. From numbers(provided at top of doc),Print all numbers greater than 5.
public class IntQue7 {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		 System.out.println("Using for each ----------------------------------------");
		 for(int a : numbers) {
			 if(a>5) {
				 System.out.print(a + " ");
			 }
		 }
		 System.out.println();
		 
		 System.out.println("Using Stream API ----------------------------------------");
		 numbers.stream().filter(x -> x>5).forEach( y -> System.out.print(y +" "));
		 
	}
}
