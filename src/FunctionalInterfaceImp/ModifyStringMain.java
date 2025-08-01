package FunctionalInterfaceImp;

//create another class and modify string 
//using lamda 
public class ModifyStringMain {
	
	public static void main(String[] args) {
		
		   ModifyString str = ( s) ->  s.toLowerCase();
		   System.out.println(str.ModifyS("SHAILAJA"));
		   
		   ModifyString str1 = (s) -> s.replace(" ", "");
		   System.out.println(str1.ModifyS(" Hello world "));
		   
		   ModifyString str2 = (s)-> s.trim();
		   System.out.println(str2.ModifyS(" Hello world "));
		   
		   ModifyString str3 = (s) -> s.replace('o', 'a');
		   System.out.println(str3.ModifyS("woolen"));
		   
		   ModifyString str4 = (s) -> s.charAt(2) + "";
		   System.out.println(str4.ModifyS("hello"));
		   
		   ModifyString str5 = (s) -> s.concat(" Modify");
		   System.out.println(str5.ModifyS("String"));
		   
		   ModifyString str6 = (s) -> s.length() + "";
		   System.out.println(str6.ModifyS("Lambda Function"));
		   
		   //Reverse string
		   ModifyString s1 = ( s ) -> {
			   String rev ="";
			   for(int i= s.length()-1; i>=0; i--) {
				   rev += s.charAt(i);
			   }
			   return rev;
		   };
		   System.out.println(s1.ModifyS("Hello"));
	}
}
