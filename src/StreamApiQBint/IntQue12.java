package StreamApiQBint;
import java.util.Arrays;
import java.util.List;

// 12. From numbers(provided at top of doc),get the first 5 elements from the list.
public class IntQue12 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Using for each-------------------------------------------");
		
		int count=0;
		for(int num : numbers) {
			if(count <5) {
				System.out.print(num + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Using Stream Api-------------------------------------------");
		numbers.stream().limit(5).forEach(x -> System.out.print(x +" "));	
	}
}
