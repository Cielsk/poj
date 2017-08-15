package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2562 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == 0 && b == 0) break;

            String str1 = reverse(a);
            String str2 = reverse(b);
            int len = str1.length() > str2.length() ? str1.length() : str2.length();
            int re = 0;
            for (int i = 0, tmp = 0; i < len; i++) {
                int x = i >= str1.length() ? 0 : Integer.valueOf(str1.substring(i, i + 1));
                int y = i >= str2.length() ? 0 : Integer.valueOf(str2.substring(i, i + 1));
                if (x + y + tmp > 9) {
                    tmp = 1;
                    re++;
                } else {
                    tmp = 0;
                }
            }
            if (re == 0) {
                System.out.println("No carry operation.");
            } else if (re == 1) {
                System.out.println("1 carry operation.");
            } else {
                System.out.printf("%d carry operations.\n", re);
            }
        }
    }

    private static String reverse(int a) {
        return new StringBuilder(Integer.toString(a)).reverse()
                                   .toString();
    }
}
