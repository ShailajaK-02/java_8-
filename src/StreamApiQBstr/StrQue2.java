package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
// 2. Print all words that start with 'a'.
// Expected output: apple, apple
public class StrQue2 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		for(String a : words) {
			if(a.startsWith("a")) {
				System.out.println(a);
			}
		}
		
		System.out.println("Using stream API-----------------------------------------------------------------------------");
		words.stream().filter(a -> a.startsWith("a")).forEach(a -> System.out.println(a));
}
}
