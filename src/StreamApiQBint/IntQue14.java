package StreamApiQBint;
import java.util.Arrays;
import java.util.List;

// 14. From numbers(provided at top of doc),check if all numbers are positive. [o/p - true/false]
public class IntQue14 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Using for loop-------------------------");
		
		boolean allPos = true;
		for(int a : numbers) {
			if(a<=0) {
				allPos = false;
				break;
			}
		}
		System.out.println("All numbers are positive ?:" + allPos);
		System.out.println("Using Stream API-------------------------");
		
		boolean res = numbers.stream().allMatch(a -> a>0);
		
		System.out.println("All nums are positive ? " + res);
	}
}
