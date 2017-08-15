package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1207 {

    public static int calc(int n) {
        int re = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            re++;
        }
        return re;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] buf = new int[10001];
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int x = a;
            int y = b;
            if (a > b) {
                x = b;
                y = a;
            }
            int max = 0;
            for (int i = x; i <= y; i++) {
                if (buf[i] == 0)  buf[i] = calc(i);
                if (buf[i] > max) max = buf[i];
            }
            System.out.println(String.format("%d %d %d", a, b, max));
        }
    }
}
