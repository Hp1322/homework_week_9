package week9;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme6Retrieve {
    public static void main(String[] args) {
        ArrayList<String> bikeName = new ArrayList<>();
        bikeName.add("Honda");
        bikeName.add("KTM");
        bikeName.add("Harly");
        bikeName.add("Ninja");
        bikeName.add("Kawasaki");
        bikeName.add("Ducati");
        bikeName.add("Yamaha");
        bikeName.add("Tvs");

        System.out.println(bikeName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter index number :");
        int index = scanner.nextInt();
        if(index < bikeName.size()){
            System.out.println(bikeName.get(index));
        }else {
            System.out.println("Enter valid index number");
        }

    }
}
