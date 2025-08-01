package StreamApiQBint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 13. From numbers(provided at top of doc),skip the first 5 elements and store rest in list.
public class IntQue13 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> numList = new ArrayList<Integer>();
		System.out.println("Using for loop-----------------------------------------------------");
		for(int i=numbers.size()-4; i<=10; i++) {
			numList.add(i);
		}
		//for each
		System.out.println("Rest elemnts :" + numList);
		
		System.out.println("Using Stream API-----------------------------------------------------");
		List<Integer> nums = numbers.stream().skip(5).collect(Collectors.toList());
		System.out.println("Rest elements:" + nums);
	}
}
