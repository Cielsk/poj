package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1565 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            if ("0".compareTo(str) == 0) break;

            int len = str.length();
            int re = 0;
            for (int i = 0; i < str.length(); i++) {
                int digit = str.charAt(i) - '0';
                re += digit * ((1 << len) - 1);
                len--;
            }
            System.out.println(re);
        }
    }
}
