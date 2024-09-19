package Sept;

public class Prog1_1909 {
    public static void main(String[] args) {
        //widening-implicit
        byte a=10;
        int b=a;
        System.out.println(b);
        //explicit
        int c = (int) a;
        System.out.println(c);

        //narrowing - implicit
        int d = 200;
        System.out.println(d);

        //explicit
        int e = (byte) d;
        System.out.println(e);


    }
}
