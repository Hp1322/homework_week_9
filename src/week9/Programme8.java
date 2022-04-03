package week9;

import java.util.HashSet;
import java.util.Set;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
 * and if else)
 */
public class Programme8 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);

        System.out.println(set);
        for(int i = 1; i <= 10; i++){
            if(set.contains(i)){
                System.out.println(i+ "Number is in the set");
            }else {
                System.out.println(i+ "Number is not in the set");
            }
        }

    }
}
