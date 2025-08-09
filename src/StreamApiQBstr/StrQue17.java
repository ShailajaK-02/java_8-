package StreamApiQBstr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//17. Filter and collect words that contain the letter 'e'
// Expected output: [apple, orange, grape, melon]
public class StrQue17 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		List<String> newWords = new ArrayList<String>();
		for(String a:words) {
			if(a.contains("e")) {
				newWords.add(a);
			}
		}
		System.out.println("New list : " + newWords);
		
		System.out.println("using streama api----------------------------------------------------------------------------");
		
		List<String> newl = words.stream().filter(a -> a.contains("e")).collect(Collectors.toList());
		System.out.println(newl);
	}
}
