package StreamApiQBint;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2. From list of integers extract even number and return them in list.
public class IntQue2 {
	public static void main(String[] args) {
		
		 List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		 
		 System.out.println("Using for each------------------------------------------------------------------------------------");
		 for( int a : listInteger) {
			 if(a%2==0) {
				 List<Integer> evenList = Arrays.asList(a);
				 System.out.print(evenList);
			 }
		 }
		 
		 System.out.println();
		 System.out.println("Using Stream Api------------------------------------------------------------------------------------");
		 List<Integer> evenList2 = listInteger.stream()
		 .filter(x -> x%2 ==0)
		 .collect(Collectors.toList());
		 System.out.println(evenList2);
		 
	}
}
