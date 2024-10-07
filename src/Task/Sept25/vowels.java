package Task.Sept25;

import javax.swing.*;

public class vowels {
    public static void main(String[] args) {
        String str = "pramod";
        int v = 0;
        int c = 0;

        for (int vc = 0; vc < str.length(); vc++) {
            char ch = str.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else {
                c++;
            }
        }
        System.out.println("Number of vowels:" + v);
        System.out.println("Number of consonants:" + c);

    }
}


