package calculate;

import java.util.Scanner;
public class Calculator {
    //instance method
    //method 1
    public void addition(int a, int b){
        System.out.println("Addition of "+a+ " and " +b+ " is "+(a+b));
    }
    //method 2
    public void subtraction(int a, int b){
        System.out.println("Subtraction of "+a+ " and " +b+ " is "+(a-b));
    }
    //method 3
    public void multiplication(int a, int b){
        System.out.println("multiplication of "+a+ " and " +b+ " is "+(a*b));
    }
    //method 4
    public void division(int a, int b){
        System.out.println("Division of "+a+ " and " +b+ " is "+(a/b));
    }
    //method 5
    public void calculateResult(int a, int b, char symbol){
      if(symbol == '+'){
          addition(a,b);
      }else if (symbol == '-'){
          subtraction(a,b);
      }else if (symbol == '*'){
          multiplication(a,b);
      }else if(symbol == '/'){
          division(a, b);
      }else {
          System.out.println("Invalid symbol");
      }
    }


}
