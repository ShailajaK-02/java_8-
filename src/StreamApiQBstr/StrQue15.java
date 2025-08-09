package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
// 15. Check if all words have more than 3 letters
// Expected output: true
public class StrQue15 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		boolean res = false;
		for(String a : words) {
			if(a.length()>3) {
				res = true;
			}
		}
		System.out.println(res);
		
		System.out.println("using stream api ------------------------------------------------------");
		
		boolean result = words.stream().allMatch(a -> a.length() > 3);
		System.out.println(result);
	}
}
