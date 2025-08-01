package MapStreamApi;
import java.util.Map;
		//1. Print all keys using Stream
public class Que1 {
	public static void main(String[] args) {
		Map<Integer, String> map = Map.of(1, "Apple", 2, "Banana", 3, "Mango");
		
		map.keySet().stream().forEach(a -> System.out.println(a));
		
		System.out.println();
	    //2. Print all values using Stream
		//entry gives us key values 
		map.entrySet().stream().forEach( a-> System.out.println(a.getValue()));
		
		// Print key-value pairs using Stream
		System.out.println();
		map.entrySet().stream().forEach(a -> System.out.println("key:" + a.getKey() + "-> " + "value: " + a.getValue()));	
		
		//4. Filter entries where value starts with 'A'
		System.out.println();
		map.entrySet().stream().filter( a -> a.getValue().startsWith("A")).forEach(a -> System.out.println(a));
		
		//5. Filter entries where key > 1
		System.out.println();
		map.entrySet().stream().filter(a -> a.getKey() > 1 ).forEach(a -> System.out.println(a));
	}
}
