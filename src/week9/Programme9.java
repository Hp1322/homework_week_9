package week9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme9 {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Kalpesh", 1);
        people.put("Saurabh", 2);
        people.put("Harsh", 3);
        people.put("Shruti", 4);
        people.put("Surbhi", 5);
        people.put("Vrunda", 6);
        people.put("Purvi", 7);

        for (Map.Entry<String, Integer> peopleName : people.entrySet()){
            System.out.println("Key = " + peopleName.getKey() +", Value = " +peopleName.getValue());
        }

    }
}
