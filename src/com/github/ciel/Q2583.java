package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2583 {

    private static int a, b, c;

    private static int func(int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int f0 = in.nextInt();
            int f1 = in.nextInt();
            int f2 = in.nextInt();
            c = f0;
            a = (f2 + f0 - 2 * f1) / 2;
            b = f1 - c - a;
            System.out.printf("%d %d %d\n", func(3), func(4),func(5));
        }
    }
}
