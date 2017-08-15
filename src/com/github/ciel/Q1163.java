package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Q1163 {

    private static int[][] buf = new int[100][100];

    private static int[][] distance = new int[100][100];

    private static int n;

    static {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                distance[i][j] = -1;
            }
        }
    }

    private static int traverse(int x, int y) {
        if (distance[x][y] < 0) {
            if (x == n - 1)
                distance[x][y] = buf[x][y];
            else {
                int left = traverse(x + 1, y);
                int right = traverse(x + 1, y + 1);

                distance[x][y] = (left > right ? left : right) + buf[x][y];
            }
        }

        return distance[x][y];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String tmp = reader.readLine();
            int index = 0;
            for (String num : tmp.split(" ")) {
                buf[i][index++] = Integer.parseInt(num);
            }
        }

        System.out.println(traverse(0, 0));
    }
}
