package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2612 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean lose = false;

        char[][] map = new char[n][n];
        char[][] touch = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = in.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            String line = in.next();
            for (int j = 0; j < n; j++) {
                touch[i][j] = line.charAt(j);
                if (!lose && touch[i][j] == 'x' && map[i][j] == '*') lose = true;
            }
        }

        char[][] re = new char[n][n];
        int[] vector = { -1, 0, 1 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (touch[i][j] == 'x' && map[i][j] == '.') {
                    int count = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (k == 1 && l == 1) continue;
                            int x = i + vector[k];
                            int y = j + vector[l];
                            if (x >= 0 && x < n && y >= 0 && y < n && map[x][y] == '*') count++;
                        }
                    }
                    re[i][j] = Integer.toString(count)
                                      .charAt(0);
                } else {
                    re[i][j] = lose ? map[i][j] : '.';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(re[i][j]);
            }
            System.out.println();
        }
    }
}
