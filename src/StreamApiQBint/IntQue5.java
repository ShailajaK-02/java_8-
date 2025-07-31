package StreamApiQBint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//5. Use listInteger(provided at top of doc), square every element in list and sum all of them, print sum over console.
public class IntQue5 {
	public static void main(String[] args) {
		 List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		 System.out.println("Using for each -----------------------------------------------------------------");
		 List<Integer> squareList = new ArrayList<Integer>();
		 int sum =0;
		 for(int a : listInteger) {
			 int squ = a*a;
			 squareList.add(squ);
		 }
		 for(int y : squareList) {
			 sum +=y;
		 }
		 System.out.println("Sum of square of the numbers is : " + sum);
		 
		 System.out.println("Using String API -----------------------------------------------------------------");
		 Optional<Integer> sumSquare = listInteger.stream().map(x -> x*x).reduce((x,y) -> x+y);
		 System.out.println("Sum is : " + sumSquare);

	}
}
