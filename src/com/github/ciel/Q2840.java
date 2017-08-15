package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2840 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String str = in.next();
            int split = str.indexOf(':');
            int hour = Integer.valueOf(str.substring(0, split));
            int minute = Integer.valueOf(str.substring(split + 1));
            if (minute != 0) {
                System.out.println(0);
            } else {
                System.out.println((hour >= 0 && hour <= 12) ? hour + 12 : hour - 12);
            }
        }
    }
}
