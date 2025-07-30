package LambdaFuncPractice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//If no is even then only print the square of the number .using predefined functional interfaces and lambda function .

public class Example1 {
	public static void main(String[] args) {
		
		Predicate<Integer> pre =  ( x ) ->  x % 2 == 0;
		Function<Integer, Integer> fun = (y) -> y*y ;
		Supplier<Integer> sup = () -> 8; 
		Consumer<Integer> con = (z) -> System.out.println("Square of even number "+ sup.get() + " is : " + z);
		
		if(pre.test(sup.get())) {
			//fun.apply(sup.get());
			con.accept(fun.apply(sup.get()));
			
		}
	}
}
