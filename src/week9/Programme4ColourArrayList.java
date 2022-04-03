package week9;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme4ColourArrayList {
    //Colour list
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Black");
        colourList.add("White");
        colourList.add("Pink");
        colourList.add("Yellow");
        colourList.add("Orange");
        for (String colourName : colourList){
            System.out.println(colourName);
        }
    }
}
