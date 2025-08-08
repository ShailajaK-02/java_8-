package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntermediateOperations {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,55,35,88,58,92);
		
		//filter method
		//case 1 -> print even
		list.stream().filter((x) -> x%2 == 0).forEach(t -> System.out.println(t));
		
		//case 2-> store even in list.
		List<Integer> evenList = list.stream().filter((x) -> x%2 == 0).collect(Collectors.toList());
		System.out.println("Even list :" + evenList);
		
		//case 3 -> count of even no.
		long countEven = list.stream().filter((x) -> x%2 == 0).count();
		System.out.println("Count of even :" + countEven);
		
		//case 4 -> sum of even no.
		Optional<Integer> sumEven = list.stream().filter((x) -> x%2==0).reduce((x,y) -> x+y);
		System.out.println("Sum of even numbers : " + sumEven.get());
		
		//short way 
		List<String> ls = Arrays.asList("shubhangi","shailaja","riya","mrunal");
		ls.stream().filter((x) -> x.startsWith("s")).forEach(x -> System.out.println(x));
	}
}
