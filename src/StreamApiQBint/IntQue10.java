package StreamApiQBint;
import java.util.Arrays;
import java.util.List;

// 10. From numbers(provided at top of doc),count how many numbers are greater than 4.
public class IntQue10 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Using for each------------------------------------------------");
		int count = 0;
		for(int a: numbers) {
			if(a>4) {
				count++;
			}
		}
		System.out.println("Numbers greater than four : "+count);
		
		System.out.println("Using Stream API------------------------------------------------");
		long Total = numbers.stream().filter(a -> a>4 ).count();
		System.out.println("Total num greater than 4 :" + Total);
	}
}
