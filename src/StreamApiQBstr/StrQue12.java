package StreamApiQBstr;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//12. Find the shortest word
// Expected output: kiwi
public class StrQue12 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple", "mango");
		String shortest =words.get(0);
		for(String a:words) {
			if(a.length() < shortest.length()) {
				shortest = a;
			}
		}
		System.out.println("Shortest word : " + shortest);
		
		System.out.println("Using stream api------------------------------------------------------");
		Optional<String> shortes = words.stream().min((a,b)  -> Integer.compare(a.length(), b.length()));
		System.out.println(shortes);
	}
}
