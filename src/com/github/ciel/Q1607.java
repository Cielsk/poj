package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1607 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cards  Overhang");
        while (in.hasNext()) {
            int n = in.nextInt();
            double re = 0;
            for (int i = 0, t = 2; i < n; i++, t += 2) {
                re += 1.0 / t;
            }
            System.out.printf("%5d  %8.3f\n", n, re);
        }
    }
}
