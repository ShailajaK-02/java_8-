package StreamApiQBint;
import java.util.Arrays;
import java.util.List;

//9. From numbers(provided at top of doc),find the minimum[lowest] number.
public class IntQue9 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Using for each------------------------------------------------------");
		int min = numbers.get(0);
		for(int a : numbers) {
			if(a<min) {
				min = a;
			}
		}
		System.out.println("Min num is :" + min);
		
		System.out.println("Using stream API------------------------------------------------------");
		//OptionalInt minV =  numbers.stream().mapToInt(Integer::intValue).min();
		int minV = numbers.stream().min((a,b) -> a-b).get();
		System.out.println("Min value is :" + minV);
	}
}
