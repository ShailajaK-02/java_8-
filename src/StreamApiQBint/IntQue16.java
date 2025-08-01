package StreamApiQBint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 16. From numbers(provided at top of doc),convert List<Integer> to List<String>
// Expected output: ["1", "2", ..., "10"]
public class IntQue16 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<String> numStr = new ArrayList<String>();
		for (int i = 0; i < numbers.size(); i++) {
            numStr.add(numbers.get(i).toString());
        }
		System.out.println("List of string : "+ numStr);
		
		System.out.println("Using stream Api--------------------------------------");
		//List<String> strList = numbers.stream().map(s -> String.valueOf(s)).collect(Collectors.toList());
		//System.out.println("list : " + strList);
		
		List<String> strList = numbers.stream().map(s -> "\""+ s + "\"").collect(Collectors.toList());
		System.out.println("list with quotes : " + strList);

	}
}
