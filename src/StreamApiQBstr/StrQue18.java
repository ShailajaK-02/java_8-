package StreamApiQBstr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//18. Map each word to its length and collect the result as a list
// Expected output: [5, 6, 5, 6, 5, 4, 5, 5, 5]
public class StrQue18 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		List<Integer> len = new ArrayList<Integer>();
		for(String a : words) {
			len.add(a.length());
		}
		System.out.println(len);
		
		System.out.println("using stream api--------------------------------------------------------------------------");
		
		List<Integer> length = words.stream().map(a -> a.length()).collect(Collectors.toList());
		System.out.println(length);
	}
}
