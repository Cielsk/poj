package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3970 {

    private static long gcd(long a, long b) {
        while (b > 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;

            long re = in.nextLong();
            for (int i = 1; i < n; i++) {
                long t = in.nextLong();
                re = re * t / gcd(re, t);
            }

            if (re >= 1000000) {
                System.out.println("Too much money to pay!");
            } else {
                System.out.println("The CEO must bring " + re + " pounds.");
            }
        }
    }
}
