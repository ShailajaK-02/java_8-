package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
// 11. Find the longest word
// Expected output: banana
public class StrQue11 {
		public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		String longest = " ";
		for(String a:words) {
			if(a.length() > longest.length()) {
				longest = a;
			}
		}
		System.out.println("Longest length : " + longest);
		System.out.println("using stream api------------------------------------------------------------------------------");
		Optional<String> lo = words.stream().max((a, b) -> Integer.compare(a.length(), b.length()));
		System.out.println("Longest length : "+lo);

	}
}

