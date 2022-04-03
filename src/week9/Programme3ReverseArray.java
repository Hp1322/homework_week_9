package week9;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Write a Java program to reverse an array of integer values
 */
public class Programme3ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {102, 250, 758, 630, 875, 123, 520, 750, 960, 15, 420};
        System.out.println("Original array : " + Arrays.toString(myArray));

        for(int i = 0; i < myArray.length / 2; i++){

            int temp = myArray [i];
            myArray[i] = myArray[myArray.length-i-1];
            myArray[myArray.length-i-1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(myArray));
    }

}
