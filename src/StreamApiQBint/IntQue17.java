package StreamApiQBint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 17. From numbers(provided at top of doc),group numbers into even and odd using Collectors.groupingBy()
// Expected output: {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
public class IntQue17 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		
		for(int a: numbers) {
			if(a % 2 == 0) {
				even.add(a);
			}
			else {
				odd.add(a);
			}
		}
		System.out.println("{ false=" + odd + " , true=" + even + "}");
		System.out.println();
		System.out.println("Using stream Api--------------------------------------");
		
		Map<Object, List<Integer>> li=numbers.stream().collect(Collectors.groupingBy(a -> a%2 == 0));
		System.out.println(li);
	}
}
