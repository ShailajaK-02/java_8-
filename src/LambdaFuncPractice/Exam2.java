package LambdaFuncPractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
//Check if num is positive or not and then print its cube 
public class Exam2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Integer value : ");
		try {
	    int a = sc.nextInt();
		
		Predicate<Integer> pre = (x) -> x > 0 ;
		Function<Integer, Integer> fun = (y) -> y*y*y ;
		Supplier<Integer> sup = () -> a;
		Consumer<Integer> con = (z) -> System.out.println("The given number " + sup.get() + " is a Positive number and The cube of this number is : " + z);
		
			if(pre.test(sup.get())) {

				con.accept(fun.apply(sup.get()));
			}
			else { System.out.println("Negative number! can not calculate cube"); 
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter valid Integer value !!Only Integer");
		}
		//finally block for SC.close();
	}
}
