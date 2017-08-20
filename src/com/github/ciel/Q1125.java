package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1125 {

    private static int[][] buf;
    private static int n;
    private static int INF = 100;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while ((n = in.nextInt()) != 0) {
            buf = new int[n + 1][n + 1];
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < n + 1; j++) {
                    if (i != j) buf[i][j] = INF;
                }
            }

            for (int i = 1; i <= n; i++) {
                int t = in.nextInt();
                for (int j = 0; j < t; j++) {
                    int a = in.nextInt();
                    int b = in.nextInt();
                    buf[i][a] = b;
                }
            }

            floyd();

            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 1; i <= n; i++) {
                int max = 0;
                for (int j = 1; j <= n; j++) {
                    if (i == j) continue;
                    if (buf[i][j] > max) max = buf[i][j];
                }
                if (max < min) {
                    index = i;
                    min = max;
                }
            }
            System.out.printf("%d %d\n", index, min);
        }
    }

    private static void floyd() {
        for (int t = 1; t <= n; t++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (buf[i][j] > buf[i][t] + buf[t][j]) buf[i][j] = buf[i][t] + buf[t][j];
                }
            }
        }
    }
}
