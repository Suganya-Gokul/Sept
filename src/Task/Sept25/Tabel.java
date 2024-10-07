package Task.Sept25;

import java.util.Scanner;

public class Tabel {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter value of n:");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        int i =1;
        while (i<=10)
        {
            System.out.println(i*n);
            i++;
        }
    }
}
