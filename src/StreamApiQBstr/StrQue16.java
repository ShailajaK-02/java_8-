package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// 16. Group words by their length using  Collectors.groupingBy()
// Example output: {4=[kiwi], 5=[grape, mango], 6=[banana, orange], ...}
public class StrQue16 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		
		System.out.println("using stream api---------------------------------------------------------------------");
		Map<Object, List<String>> li = words.stream().collect(Collectors.groupingBy(a -> a.length()));
		System.out.println(li);
	}
}
