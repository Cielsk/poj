package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3173 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[][] buf = new int[n][n];

        for (int i = 0, t = s; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) continue;
                if (t == 10) t = 1;
                buf[j][i] = t;
                t++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (buf[i][j] == 0) {
                    System.out.print(' ');
                } else {
                    System.out.print(buf[i][j]);
                }
                if (j < n - 1) System.out.print(' ');
            }
            System.out.println();
        }
    }
}
