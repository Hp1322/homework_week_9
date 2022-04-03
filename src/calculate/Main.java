package calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        String answer;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number :");
            int a1 = scanner.nextInt();
            System.out.println("Enter second number :");
            int b1 = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*, /:");
            char symbol1 = scanner.next().charAt(0);
            Calculator obj = new Calculator();
            obj.calculateResult(a1,b1,symbol1);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” : ");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while(answer.startsWith("y"));
        }
    }


