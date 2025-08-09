package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
//14. Check if any word contains the letter 'z'
// Expected output: false
public class StrQue14 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		boolean found = true;
		for(String a: words) {
			if(a.contains("z")) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("false");
		}
		System.out.println("using stream api----------------------------------------------------------------------------");
		
		boolean res = words.stream().anyMatch(a -> a.contains("z"));
		System.out.println(res);
	}
}
