package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntro {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//helps to acheive functional programming
		
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		
		//source -> stream
		//stream of list
		Stream<Integer> list = l.stream();
		
		//stream of array
		Integer[] a = {5,6,7,8,9};
		Arrays.stream(a);
		
		//using stream.of method
		Stream<String> name = Stream.of("s","ab","abc");
		
	}
}
