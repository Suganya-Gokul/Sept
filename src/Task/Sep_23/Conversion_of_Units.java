package Task.Sep_23;

import java.util.Scanner;

public class Conversion_of_Units {
    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select following unit conversion:");
        System.out.println("Choice 1: Convert Kilometers to Miles or Miles to Kilometers");
        System.out.println("Choice 2: Convert Celsius to Fahrenheit or Fahrenheit to Celsius");

        int Choice = sc.next();
        str = sc.nextLine();

        switch (Choice)
        {
            System.out.println("Enter 'KMTM' to convert Kilometers to Miles or" +
                    " 'MTKM' to convert Miles to Kilometers:");
            str = sc.nextLine();
            if ('KMTM'){
                System.out.println("Enter KM value:");
                int KM = sc.nextLine();
                double miles = KM *(0.621371);
                System.out.println(miles);
            } else if ('MTKM') {
                System.out.println("Enter M vale:");
                int M = sc.nextLine();
                double kilometer = M*(1.60934);
                System.out.println(kilometer);
            }
            break;

            case 2:
                System.out.println("Enter 'CTF' to convert Celsius to Fahrenheit or 'FTC' to convert Fahrenheit to Celsius:");
                str = sc.nextLine();

                if (str.equals("CTF")) {
                    System.out.println("Enter the temperature in Celsius:");
                    int celsius = sc.nextInt();
                    double fahrenheit = (celsius * 9 / 5.0) + 32;
                    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
                } else if (str.equals("FTC")) {
                    System.out.println("Enter the temperature in Fahrenheit:");
                    int fahrenheit = sc.nextInt();
                    double celsius = (fahrenheit - 32) * 5 / 9.0;
                    System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
                } else {
                    System.out.println("Invalid input for conversion.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;





        }



    }
}
