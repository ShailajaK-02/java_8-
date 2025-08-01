package StreamApiQBint;
import java.util.Arrays;
import java.util.List;

// 15. From numbers(provided at top of doc),check if any number is divisible by 7.[o/p - true/false]
public class IntQue15 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 10);
		boolean anyNum = false;
		for(int a: numbers) {
			if(a%7 == 0) {
				anyNum = true;
				break;
			}
		}
		System.out.println("Any num is divisible by 7 ? " + anyNum);
		System.out.println("Using stream Api--------------------------------------------");
		
		boolean res =numbers.stream().anyMatch(a -> a%7 == 0);
		
		System.out.println("Any num is divisible by 7 ? "+ res);
	}
}
