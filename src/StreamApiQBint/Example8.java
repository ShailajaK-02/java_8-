package StreamApiQBint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//max num
public class Example8 {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 List<Integer> newList = new ArrayList<Integer>();
		 //for loop
		 for(int i=numbers.size(); i>=0; i--) {
			 newList.add(i);
		 }
		 System.out.println("Max ele is :" + newList.get(0));
		 System.out.println("Using stream api ------------------------------------------------------------");
		 
		 List<Integer> sorted =numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 System.out.println("The highest num is : " + sorted.get(0));
	}
}
