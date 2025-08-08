package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
//3. Print all words with length greater than 5.
// Expected output: banana, orange
public class StrQue3 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		for(String a : words) {
			if(a.length()>5) {
				System.out.println(a);
			}
		}
		System.out.println("Using stream api--------------------------------------------------------------------------");
		words.stream().filter(a -> a.length()>5).forEach(a -> System.out.println(a));
	}
}
