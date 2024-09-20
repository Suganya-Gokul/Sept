package Sept;

public class Trianglr_Classifier {
    public static void main(String[] args) {
        /*Write a program that classifies a triangle based on its side lengths.
        Given three input values representing the lengths of the sides, determine
        if the triangle is equilateral (all sides are equal),
        isosceles (exactly two sides are equal), or
        scalene (no sides are equal).
        Use an if-else statement to classify the triangle.
        side1, side2, side3 -> */

        int a=10, b=20, c=15;

        if(a==b && a==c)
        {
            System.out.println("Equilateral triangle");
        }
        else if (a==b & a!=c)
        {
            System.out.println("Isoceles triangle");
        }
        else if (c==b && a!=c)
        {
            System.out.println("Isoceles triangle");
        }
        else if (a==c && b!=c)
        {
            System.out.println("Isoceles triangle");
        }
        else
            System.out.println("Scalen triamgle");


    }
}
