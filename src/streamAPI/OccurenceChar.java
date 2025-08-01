package streamAPI;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//find occurence of each character in string using map 
public class OccurenceChar {
	public static void main(String[] args) {
		
		String name = "shailaja";
		
		Map<Character, Long> charCount= name.chars()  //chars() -> convert it into INTStream
				.mapToObj(c -> (char) c)  // .mapToObj(c -> (char) c) → stream of characters (Stream<Character>)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		charCount.forEach((k,v) -> {
			
			System.out.println(k + " = " + v);
		});
	}
}
