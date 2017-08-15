package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2656 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            int max = 0;
            int re = 0;
            for (int i = 1; i <= n; i++) {
                int hour = in.nextInt() + in.nextInt();
                if (hour > 8 && hour > max) {
                    max = hour;
                    re = i;
                }
            }
            System.out.println(re);
        }
    }
}
