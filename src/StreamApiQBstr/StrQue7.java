package StreamApiQBstr;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// 7. Sort the list alphabetically.
public class StrQue7 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		Collections.sort(words);
		for(String a : words) {
			System.out.println(a);
		}
		
		System.out.println("using stream api-------------------------------------------------------------------------");
		words.stream().sorted().forEach(a -> System.out.println(a));
	}
}
