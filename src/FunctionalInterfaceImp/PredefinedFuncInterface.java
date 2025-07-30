package FunctionalInterfaceImp;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class PredefinedFuncInterface {
	public static void main(String[] args) {
		//predicate interface
		Predicate<Integer> p = (a) -> a % 2 ==0;
		System.out.println(p.test(25));
		//function interface
		Function<Integer, Integer> f = (x) -> x* 2;
		int result = f.apply(20);
		System.out.println(result);
		//consumer interface
		Consumer<String> c = y -> System.out.println(y);
		c.accept("consumer");
		//supplier 
		Supplier<String> sup = () -> "Supplier";
		System.out.println(sup.get());
		//two parameters Bipredicate
		BiPredicate<Integer, Integer> bp = (x,y) -> (x+y) %2 == 0;
		System.out.println(bp.test(5, 3));
		//Biconsumer interface
		BiConsumer<String, String> bic = (x,y) -> {
			System.out.println("String a : " + x);
			System.out.println("String b : " + y);
		};
		bic.accept("hello", "world");
		//bisupplier does not exist
		//Bifunction 
		BiFunction<Integer, Integer, Integer> bifu = (a,b) -> (a+b)/2;
		System.out.println(bifu.apply(2, 10));
		
		//if no is even then print square
	}
}
