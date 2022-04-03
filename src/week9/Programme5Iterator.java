package week9;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Programme5Iterator {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Black");
        colourList.add("White");
        colourList.add("Pink");
        colourList.add("Yellow");
        colourList.add("Orange");

        Iterator itr = colourList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
