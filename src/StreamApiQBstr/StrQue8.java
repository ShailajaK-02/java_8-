package StreamApiQBstr;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// 8. Sort the list in reverse alphabetical order
public class StrQue8 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		Collections.sort(words);
		for(int i=words.size()-1; i>=0;i--) {
			System.out.println(words.get(i));
		}
	}
}
