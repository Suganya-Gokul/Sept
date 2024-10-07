package Task;

public class Grade {
    public static void main(String[] args) {
        //int a=10, b=20, c=45;
        //condition ? expression_if_true: expression_if_false

       /* int max_a = (a>b)? a:b;
        System.out.println(max_a);

        int max = (max_a>c)?max_a:c;
        System.out.println(max);*/

        //Ques2:
        //  score >= 90 → A
        //  score >= 80 → B
        //  score >= 70 → C

        int score=85;
        String result = (score>=90) ? "A":(score>=80)? "B":(score>=70)?"C":"F";
        System.out.println(result);

    }
    }

