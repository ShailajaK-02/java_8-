package StreamApiQBstr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//4. Convert all strings to uppercase and store it in list.
// Expected output: [APPLE, BANANA, MANGO, ORANGE, GRAPE, KIWI, MELON, APPLE, MANGO
public class StrQue4 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		List<String> newL = new ArrayList<String>();
		for(String a : words) {
			newL.add(a.toUpperCase());
		}
		System.out.println(newL);
		
		System.out.println("Using stream api--------------------------------------------------------------------------");
		List<String> newList = words.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
		System.out.println(newList);
	}
}
