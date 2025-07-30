package StreamApiQBint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 16. From numbers(provided at top of doc),convert List<Integer> to List<String>
//Expected output: ["1", "2", ..., "10"]
public class ExamConvert {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 10);
	    List<String> newList = new ArrayList<String>();
	    for(int i =0; i<numbers.size(); i++) {
	    	newList.add(numbers.get(i).toString());
	    }
	    System.out.println(newList );
	    
	    
	}
}
