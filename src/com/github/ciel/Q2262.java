package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2262 {

    private static boolean[] buf = new boolean[1000000];

    private static void prime() {
        for (int i = 2; i <= 1000; i++) {
            if (buf[i]) continue;
            for (int j = 2; i * j < 1000000 ;j++) {
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
            boolean flag = false;
            for (int i = 2; i < n; i++) {
                if (!buf[i] && !buf[n - i] && n - i != 1) {
                    flag = true;
                    System.out.printf("%d = %d + %d\n", n, i, n - i);
                    break;
                }
            }
            if (!flag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
