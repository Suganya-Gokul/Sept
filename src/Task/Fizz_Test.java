package Task;

public class Fizz_Test {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."\

        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0) {
                if (a % 5 == 0) {
                    System.out.println("Fizzbizz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        }
    }
}

