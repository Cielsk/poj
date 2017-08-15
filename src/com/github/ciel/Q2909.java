package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2909 {

    private final static int MAX = (int) Math.pow(2, 15);
    private static boolean[] buf = new boolean[MAX + 1];

    private static void prime() {
        for (int i = 2; i * i <= MAX; i++) {
            if (buf[i]) continue;
            for (int j = 2; i * j <= MAX;j++) {
                buf[i*j] = true;
            }
        }
    }

    public static void main(String[] args) {
        prime();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;

            int re = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (!buf[i] && !buf[n - i] && n - i != 1) {
                    re++;
                }
            }
            System.out.println(re);
        }
    }
}
