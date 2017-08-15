package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3475 {

    private static int count(double a, double b, double c, double d) {
        int re = 0;
        while (Double.compare(c, a) > 0) {
            re++;
            c /= 2;
        }
        while (Double.compare(d, b) > 0) {
            re++;
            d /= 2;
        }
        return re;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            double d = in.nextDouble();
            int n = count(a, b, c, d);
            int m = count(b, a, c, d);
            System.out.println(n > m ? m : n);
        }
    }
}
