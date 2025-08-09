package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
// 10. Count words with length exactly 5
// Expected output: 2 (grape, mango)
public class StrQue10 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		int count =0;
		for(String i : words) {
			if(i.length()==5) {
				count++;
			}
		}
		System.out.println("Count words with length exactly 5: " + count);
	    System.out.println("using stream api----------------------------------------------------------------------------------");
	    
	    long Total = words.stream().filter(a -> a.length()==5).count();
	    System.out.println("Count words with length exactly 5: " + Total);
	}
}
