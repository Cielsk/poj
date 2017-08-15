package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1088 {

    private static int n, m;
    private static int[][] map = new int[100][100];
    private static int[][] length = new int[100][100];

    private static int calc(int x, int y) {
        if (length[x][y] > 0) return length[x][y];

        int up = x > 0 && map[x-1][y] < map[x][y] ? calc(x - 1, y) : 0;
        int down = x < n - 1 && map[x+1][y] < map[x][y] ? calc(x + 1, y) : 0;
        int left = y > 0 && map[x][y-1] < map[x][y] ? calc(x, y - 1) : 0;
        int right = y < m - 1 && map[x][y+1] < map[x][y] ? calc(x, y + 1) : 0;

        length[x][y] = max(max(max(up, down), left), right) + 1;

        return length[x][y];
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = in.nextInt();
            }
        }

        int re = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                calc(i, j);
                if (length[i][j] > re) re = length[i][j];
            }
        }
        System.out.println(re);
    }
}
