package StreamApiQBint;
import java.util.Arrays;
import java.util.List;

// 11. From numbers(provided at top of doc),sort the list in reverse order.
public class IntQue11 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Using for loop--------------------------------------");
		for(int i=numbers.size(); i>=1; i--) {
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("Using Stream API--------------------------------------");
		numbers.stream().sorted((a,b) -> b-a).forEach(a -> System.out.print(a +" "));

	}
}
