package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
// 9. Count how many times "apple" appears
public class StrQue9 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		int count = 0;
		for(String i : words) {
			if(i=="apple") {
				count++;
			}
		}
		System.out.println("Count of apple  : "+ count);
		System.out.println("stream api -------------------------------------------------------------------------------------");
		long Count = words.stream().filter(a -> a=="apple").count();
		System.out.println(Count);
	}
}
