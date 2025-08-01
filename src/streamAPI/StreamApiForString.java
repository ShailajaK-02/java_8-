package streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamApiForString {
	public static void main(String[] args) {
		List<String> animalName = Arrays.asList("Tiger","Tortoise","Eagle","Dog","Lion");
		//list of animal start with t 
		List<String> listone = animalName.stream()
		.filter(x -> x.startsWith("T")) 
		.collect(Collectors.toList());
		System.out.println(listone);
		//count of animal starts with t
		long count = animalName.stream()
		.filter(x -> x.startsWith("T"))
		.count();
		System.out.println("Count of animal starts with t :" + count);
		System.out.println("========================");
		//print all animal in uppercase
		animalName.stream()
		.map(y -> y.toUpperCase())
		.forEach(x -> System.out.println(x));
		System.out.println("========================");
		//print animal starting with t in uppercase
		animalName.stream()
		.filter(y -> y.startsWith("T"))
		.map(z -> z.toUpperCase())
		.forEach(x -> System.out.println(x));
		//we can use multiple filter and map 
		System.out.println("========================");
		//Arrange in ascending order or alphabetical order
		animalName.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("========================");
		//Skip first 2 elements 
		animalName.stream().sorted().skip(2).forEach(x -> System.out.println(x));
		System.out.println("========================");
		//Print only 3 elements from starting 
		
		animalName.stream().sorted().limit(3).forEach(x -> System.out.println(x));
		
	}
}
