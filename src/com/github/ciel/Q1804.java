package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1804 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] buf = new int[n];
            for (int j = 0; j < n; j++) {
                buf[j] = in.nextInt();
            }
            int re = 0;

            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (buf[k] < buf[j]) re++;
                }
            }

            System.out.printf("Scenario #%d:\n", i + 1);
            System.out.println(re);
            System.out.println();
        }
    }
}
