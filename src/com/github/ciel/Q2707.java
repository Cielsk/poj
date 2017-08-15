package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2707 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if (a == 0 && b == 0 && c == 0 && d == 0) break;

            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            if (c > d) {
                int t = c;
                c = d;
                d = t;
            }
            int t1 = c * 100 / a;
            int t2 = d * 100 / b;
            int re = t1 < t2 ? t1 : t2;
            if (re > 100) re = 100;
            System.out.printf("%d%%\n", re);
        }
    }
}
