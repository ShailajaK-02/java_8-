package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;

//Print all words
public class StrQue1 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		
		for(String a: words) {
			System.out.println(a);
		}
		
		System.out.println("Using stream api--------------------------------------------");
		words.stream().forEach(a -> System.out.println(a));
	}
}
