package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3302 {

    private static boolean contains(String s1, String s2) {
        for (int i = 0, j = -1; i < s2.length(); i++) {
            char c = s2.charAt(i);
            for (j++; j < s1.length() && c != s1.charAt(j); j++) ;
            if (j >= s1.length()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s1 = in.next();
            String s2 = in.next();
            String s3 = new StringBuilder(s2).reverse().toString();
            if (contains(s1, s2) || contains(s1, s3)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
