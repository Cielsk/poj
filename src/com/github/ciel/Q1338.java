package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1338 {

    public static final int MAX = 1500;

    public static final int[] buf = new int[MAX + 1];

    private static int min(int a, int b, int c) {
        int min = a < b ? a : b;
        min = min < c ? min : c;
        return min;
    }

    static {
        buf[1] = 1;
        int toMulti2 = 1;
        int toMulti3 = 1;
        int toMulti5 = 1;
        for (int i = 2; i <= MAX; i++) {
            buf[i] = min(buf[toMulti2] * 2, buf[toMulti3] * 3, buf[toMulti5] * 5);
            if (buf[i] == buf[toMulti2] * 2) toMulti2++;
            if (buf[i] == buf[toMulti3] * 3) toMulti3++;
            if (buf[i] == buf[toMulti5] * 5) toMulti5++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            System.out.println(buf[n]);
        }
    }
}
