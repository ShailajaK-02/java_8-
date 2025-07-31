package StreamApiQBint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 6. Create a integer list with duplicate and remove those with for loop and stream api.
public class IntQue6 {
    public static void main(String[] args) {
        List<Integer> originalList = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 5, 7, 8);
        List<Integer> unique = new ArrayList<>();
        System.out.println("Using for each -------------------------------");

        for (Integer a : originalList) {
            if (!unique.contains(a)) {
                unique.add(a);
            }
        }
        System.out.println("Unique elements :" + unique);
        
        System.out.println("Using Stream API-------------------------------");
        originalList.stream().distinct().forEach(x -> System.out.print(" " + x));
        
    }
}
