package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3673 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int re = 0;
        for (int i = 0; i < a.length(); i++) {
            int n = Integer.valueOf("" + a.charAt(i));
            for (int j = 0; j < b.length(); j++) {
                int m = Integer.valueOf("" + b.charAt(j));
                re += n * m;
            }
        }
        System.out.println(re);
    }
}
