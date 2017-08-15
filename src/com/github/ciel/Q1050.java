package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1050 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] buf = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                buf[i][j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                for (int k = 0; k < n; k++) {
                    buf[i][k] += buf[j][k];
                    if (temp > 0) {
                        temp += buf[i][k];
                    } else {
                        temp = buf[i][k];
                    }
                    if (temp > max) max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
