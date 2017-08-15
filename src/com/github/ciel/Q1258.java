package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1258 {

    private static int prim(int[][] map) {
        int len = map.length;
        int re = 0;
        int[] lowCost = new int[len];
        boolean[] used = new boolean[len];

        for (int i = 0; i < len; i++) {
            lowCost[i] = map[0][i];
            used[i] = false;
        }
        used[0] = true;

        for (int i = 1, j = 0; i < len; i++) {
            j = 0;
            while (j < len && used[j]) j++;
            for (int k = 0; k < len; k++) {
                if (!used[k] && lowCost[k] < lowCost[j]) {
                    j = k;
                }
            }
            re += lowCost[j];
            used[j] = true;
            for (int k = 0; k < len; k++) {
                if (!used[k] && map[j][k] < lowCost[k]) {
                    lowCost[k] = map[j][k];
                }
            }
        }

        return re;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[][] buf = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    buf[i][j] = in.nextInt();
                }
            }

            System.out.println(prim(buf));
        }
    }
}
