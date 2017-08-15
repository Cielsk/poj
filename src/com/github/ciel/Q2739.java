package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2739 {

    private static boolean[] buf = new boolean[10001];

    static {
        for (int i = 2; i <= 100; i++) {
            if (buf[i]) continue;
            for (int j = 2; j * i <= 10000; j++) {
                if (!buf[i * j]) buf[i*j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;

            int re = 0;
            for (int i = 2; i <= n; i++) {
                if (buf[i]) continue;
                for (int j = i, sum = 0; j <= n; j++) {
                    if (!buf[j]) sum += j;
                    if (sum == n) {
                        re++;
                        break;
                    }
                    if (sum > n) {
                        break;
                    }
                }
            }
            System.out.println(re);
        }
    }
}
