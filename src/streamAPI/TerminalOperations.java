package streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class TerminalOperations {
	public static void main(String[] args) {
		//output cab be in collection,console..
		List<Integer> list = Arrays.asList(1,2,3,3,4,4,5);
		//source -> stream
		//Consumer <Integer> c = (z) -> System.out.println(z);
		//for each -> print on console
		list.stream().forEach(z -> System.out.println(z));
		//in form of list
		List<Integer> li = list.stream().collect(Collectors.toList());
		System.out.println(li);
		//count the num of ele in list.
		long count = list.stream().count();
		System.out.println(count);
		//count unique elements excepts duplicate
		long count2 = list.stream().distinct().count();
		System.out.println(count2);
		//sum of complete list
		Optional<Integer> sum = list.stream().reduce((x,y) -> x+y);
		System.out.println("Sum of all elements in list :" + sum.get());
		//find avg for same sum/count hw
		//short-circuiting [Terminal operators]
		// any match , allmatch , nonematch
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		List<String> studentName = Arrays.asList("Suyash","Sam","Raj","Akshay","Siya");
		boolean s1 = studentName.stream().anyMatch((x) -> x.length() == 2);
		System.out.println("anyMatch() It will return true if any one match is found or return false : " + s1);
		boolean s2 = studentName.stream().allMatch( x -> x.length() >= 3);
		System.out.println("allMatch() Return true if it matches all the elements otherwise false : " + s2);
		boolean s3 = studentName.stream().noneMatch(x -> x.startsWith("z"));
		System.out.println("nonematch() return true if nothing is match otherwise false if any one match found : " + s3);
	}
}
