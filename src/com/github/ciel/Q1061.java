package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1061 {

    private static long p, q;

    private static long exgcd(long a, long b) {
        if (b == 0) {
            p = 1;
            q = 0;
            return a;
        }

        long re = exgcd(b, a % b);
        long p0 = p;
        p = q;
        q = p0 - a / b * q;

        return re;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        long m = in.nextLong();
        long n = in.nextLong();
        long l = in.nextLong();

        if (m == n && x != y) {
            System.out.println("Impossible");
        } else {
            if (m < n) {
                long t = m;
                m = n;
                n = t;

                t = x;
                x = y;
                y = t;
            }

            long c = y - x;
            long d = exgcd(m - n, l);

            if (c % d != 0) {
                System.out.println("Impossible");
            } else {
                System.out.println(((p * c / d) % (l / d) + l / d) % (l / d));
            }
        }
    }
}
