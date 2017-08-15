package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1664 {

    private static int[][] buf = new int[11][11];

    static {
        for (int i = 1; i < 11; i++) {
            buf[i][1] = buf[1][i] = 1;
        }
    }

    private static int func(int m, int n) {
        if (buf[m][n] > 0) return buf[m][n];
        int re = 0;
        if (m < n) {
            re = func(m, m);
        } else if (m == n) {
            re = 1 + func(m, m - 1);
        } else {
            re = func(m - n, n) + func(m, n - 1);
        }
        buf[m][n] = re;
        return re;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(func(a, b));
        }
    }
}
