package Task;

public class Leapyear {
    public static void main(String[] args) {
        int year = 2024;
        if (year %4==0)
        {
            if (year%100==0)
            {
                if (year %400 == 0)
                {
                    System.out.println("It is leap year");
                }
                else
                {
                    System.out.println("Not a leap year");
                }
            }
            else
            {
                System.out.println("Not a leap year");
            }
        }
        else
        {
            System.out.println("It is a leap year");
        }
    }
    }

