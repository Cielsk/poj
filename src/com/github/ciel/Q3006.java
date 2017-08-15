package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3006 {

    public static final int MAX = 1000000;

    public static final boolean[] buf = new boolean[MAX];

    static {
        buf[0] = buf[1] = true;
        for (int i = 2; i <= 1000; i++) {
            if (buf[i]) continue;
            for (int j = i; j * i < MAX; j++) {
                if (!buf[i * j]) buf[i * j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int d = in.nextInt();
            int n = in.nextInt();
            if (a == 0 && d == 0 && n == 0) break;

            int re = 0;
            for (int i = a, c = 0; i < MAX; i += d) {
                if (!buf[i]) c++;
                if (c == n) {
                    re = i;
                    break;
                }
            }
            System.out.println(re);
        }
    }
}
