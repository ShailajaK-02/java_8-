package FunctionalInterfaceImp;
//lambda function 

public class Demo {
	
	public static void main(String[] args) {
	
		  Calculator c = ( a, b) ->  a+b; 
		  System.out.println("Addition : " + c.doOperation(11, 12));
		  
		  Calculator ca = (a,b) ->  a-b;
		  System.out.println("Subtraction :" + ca.doOperation(25, 15));
		  
		  Calculator m = (a,b) -> a*b;
		  System.out.println("Multiplication : "+ m.doOperation(11, 11));
		  
		  Calculator d = (a,b) -> a/b;
		  System.out.println("Division : " + d.doOperation(10, 2));
	}
}
//create another class and modify string 
//using lamda 
