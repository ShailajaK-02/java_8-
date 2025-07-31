package StreamApiQBint;
import java.util.Arrays;
import java.util.List;

// 3. count odd integers from list of integer.
public class IntQue3 {
	public static void main(String[] args) {
		 List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		 
		 System.out.println("using for each--------------------------------------------------------");
		 int count =0;
		 for(int a : listInteger) {
			 if(a%2 ==1) {
				 count++;
			 }
		 }
		 System.out.println("count of odd integer is : " + count);
		 
		 System.out.println("using Stream Api--------------------------------------------------------");
		 long oddCount =  listInteger.stream().filter(x -> x %2 == 1).count();
		 System.out.println("Count of odd ineger is :" + oddCount );
		 
	}
}
