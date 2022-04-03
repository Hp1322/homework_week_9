package week9;
/**
 * Write a Java program to test an array list is empty or not. Define array list with
 * underground tube names
 */

import java.util.ArrayList;
public class Programme7Tubes {
    public static void main(String[] args) {
        ArrayList<String> tubeName = new ArrayList<>();
        tubeName.add("Circle Line");
        tubeName.add("Piccadilly Line");
        tubeName.add("Central Line");
        tubeName.add("Jubilee Line");
        tubeName.add("Northern Line");
        tubeName.add("Metropolitan Line");
        tubeName.add("Bakerloo Line");

        System.out.println(tubeName);
        if(tubeName.isEmpty()){
            System.out.println("Array list is empty");
        }else {
            System.out.println("Array list is not empty");
        }

    }
}
