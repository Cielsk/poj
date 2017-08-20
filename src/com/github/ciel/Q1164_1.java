package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 *
 */
public class Q1164_1 {

    private static int count;
    private static int maxSquare;
    private static int[][] map;
    private static int m, n;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line = reader.readLine();
        m = Integer.parseInt(line);
        line = reader.readLine();
        n = Integer.parseInt(line);

        map = new int[m][n];
        for (int i = 0; i < m; i++) {
            line = reader.readLine();
            String[] temp = line.split("\\s");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

        traverse();
        System.out.println(count);
        System.out.println(maxSquare);
    }

    private static void traverse() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] < 0) continue;
                int square = dfs(i, j);
                count++;
                if (square > maxSquare) maxSquare = square;
            }
        }
    }

    private static int dfs(int a, int b) {
        int sqaure = 1;
        int[][] move = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 } };

        int t = map[a][b];
        map[a][b] = -1;
        for (int i = 0; i < 4; i++, t /= 2) {
            if (t % 2 == 1) continue;
            int x = a + move[i][0];
            int y = b + move[i][1];
            if (x < 0 || x >= m || y < 0 || y >= n || map[x][y] < 0) continue;
            sqaure += dfs(x, y);
        }

        return sqaure;
    }
}
