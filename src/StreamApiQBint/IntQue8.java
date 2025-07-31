package StreamApiQBint;
import java.util.Arrays;
import java.util.List;

// 8. From numbers(provided at top of doc),find the maximum[highest] number.
public class IntQue8 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		 System.out.println("Using for each ----------------------------------------");
		 int max = numbers.get(0);
		 for(int a : numbers) {
			 if(a>max) {
				 max = a;
			 }
		 }
		 System.out.println("Maximum number is : " + max);
		 
		 System.out.println("Using Stream API ----------------------------------------");
		// OptionalInt maxNum = numbers.stream().mapToInt(Integer::intValue).max();  // MapTo int convert into intFind maximum value
		 int maxNum = numbers.stream().max((a,b) -> a-b).get();
		 System.out.println("Max num is :" + maxNum);
	}
}
