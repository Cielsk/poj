package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3589 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String ans = in.next();
            String re = in.next();
            int a = 0;
            int b = 0;
            for (int i = 0; i < re.length(); i++) {
                if (ans.charAt(i) == re.charAt(i)) a++;
                else if (ans.contains("" + re.charAt(i))) b++;
            }
            System.out.printf("%dA%dB\n", a, b);
        }
    }
}
