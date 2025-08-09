package StreamApiQBstr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// 20. Skip the first 3 elements and print the rest
// Expected output: [orange, grape, kiwi, melon, apple, mango]
public class StrQue20 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		
		System.out.println("using stream api------------------------------------------------------------------------------");
		List<String> newL = words.stream().skip(3).collect( Collectors.toList());
		System.out.println(newL);
	}
}
