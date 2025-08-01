package streamAPI;
import java.util.ArrayList;
import java.util.List;
//create list of country india then create list of state in country and then create list of 4 cities in that states.
public class ListOfList {
	public static void main(String[] args) {
			
		List<String> MH = new ArrayList<String>();
		MH.add("pune");
		MH.add("mumbai");		
		
		List<String> MP = new ArrayList<String>();
		MP.add("Rajkot");
		MP.add("Bihar");
		
		List<List<String>> india = new ArrayList<List<String>>();

		india.add(MH);
		india.add(MP);
		
		for(List<String> a :india) {
			System.out.println(a);
			for(String s :a) {
				System.out.println(s);
			}
		}
	}
}
