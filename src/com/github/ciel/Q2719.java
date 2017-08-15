package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2719 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            StringBuilder str = new StringBuilder("" + n);
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c > '4') {
                    str.setCharAt(i, --c);
                }
            }
            int re = Integer.valueOf(str.toString(), 9);
            System.out.printf("%d: %d\n", n, re);
        }
    }
}
