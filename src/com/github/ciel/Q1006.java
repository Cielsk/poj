package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1006 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = 23;
        int d2 = 28;
        int d3 = 33;
        int product = d1 * d2 * d3;
        int count = 1;

        while (in.hasNext()) {
            int m1 = in.nextInt();
            int m2 = in.nextInt();
            int m3 = in.nextInt();
            int start = in.nextInt();
            if (m1 == -1 && m2 == -1 && m3 == -1 && start == -1) break;
            int re = (5544 * m1 + 14421 * m2 + 1288 * m3 - start) % product;
            if (re <= 0) re += product;
            System.out.printf("Case %d: the next triple peak occurs in %d days.\n", count++, re);
        }
    }
}
