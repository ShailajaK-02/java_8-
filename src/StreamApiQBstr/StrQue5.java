package StreamApiQBstr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// 5. Convert all strings to lowercase and store it in list.
public class StrQue5 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("APPLE", "BANANA"," MANGO", "ORANGE"," GRAPE"," KIWI"," MELON"," APPLE"," MANGO");
		List<String> Upper = new ArrayList<String>();
		for(String a : words) {
			Upper.add(a.toLowerCase());
		}
		System.out.println(Upper);
		
		System.out.println("using stream api---------------------------------------------------------");
		List<String> NewL =words.stream().map(a -> a.toLowerCase()).collect(Collectors.toList());
		System.out.println(NewL);
	}
}
