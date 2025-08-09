package StreamApiQBstr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// 19. Get the first 3 elements of the list
// Expected output: [apple, banana, mango]
public class StrQUe19 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		List<String> newl = new ArrayList<String>();
		int count =0;
		for(String a: words) {
			if(count <3) {
				newl.add(a);
				count++;
			}
		}
		System.out.println(newl);
		
		System.out.println("using stream api-----------------------------------------------------------------------------");
		
		List<String> newList = words.stream().limit(3).collect(Collectors.toList());
		System.out.println(newList);
	}
}
