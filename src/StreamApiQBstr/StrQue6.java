package StreamApiQBstr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//. Remove duplicates from the list
// Expected output: [apple, banana, mango, orange, grape, kiwi, melon]
public class StrQue6 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		List<String> Unique = new ArrayList<String>();
		for(String a : words) {
			if(!Unique.contains(a)) {
				Unique.add(a);
			}
		}
		System.out.println("Unique list : " + Unique);
		System.out.println("Using stream api---------------------------------------------------------------------------");
		List<String> wo =words.stream().distinct().collect(Collectors.toList());
		System.out.println(wo);
	}
}
