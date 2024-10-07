package Task.Sep_23;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num:");
        double num1= sc.nextInt();

        System.out.println("Enter 2nd num:");
        double num2=sc.nextInt();

        System.out.println("Enter Operation:");
        String operation = sc.next();
        double value = 0.0;

       switch (operation){
           case "+":
               value = num1 + num2;
               System.out.println(value);
               break;

           case "-":
               value = num1 - num2;
               System.out.println(value);
               break;

           case "*":
               value = num1 * num2;
               System.out.println(value);
               break;

           case "/":
               value = num1/num2;
               System.out.println(value);
               break;

           case "%":
               value = num1%num2;
               System.out.println(value);
               break;

       }







    }
}
