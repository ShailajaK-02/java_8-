package StreamApiQBint;

import java.util.Arrays;
import java.util.List;

// 1. From list of integers extract even number and print them on console.
public class IntegerQue1 {
		public static void main(String[] args) {
			 List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
			 System.out.println("using for each ----------------------------------------------------------------------------------");
			 //using for each 
			 for(int a : listInteger) {
				 if(a%2 ==0) {
					 System.out.println(a);
				 }
			 }
			 
			 System.out.println("using Stream api ----------------------------------------------------------------------------------");
			 //using stream api
			 listInteger.stream()
			 .filter(x -> x%2==0)
			 .forEach(x -> System.out.println(x));
		}
}
