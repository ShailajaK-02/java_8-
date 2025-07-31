package StreamApiQBint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 4. Use listInteger(provided at top of doc) list to generate output as list 
//output → 4,16,36,64,100.
public class IntQue4 {
	public static void main(String[] args) {
		 List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		 
		 System.out.println("using for each : -------------------------------------------");
		 List<Integer> squareList = new ArrayList<Integer>();
		 for(int a : listInteger) {
			 int squ = a*a;
			 squareList.add(squ);
		 }
		 System.out.println("List of square : " + squareList);
		 
		 System.out.println("using Stream API: -------------------------------------------");
		 List<Integer> squ= listInteger.stream().map(x -> x*x ).collect(Collectors.toList());
		 System.out.println("Square of int : " + squ );

	}
}
