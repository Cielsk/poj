package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2361 {

    private static boolean win(char[][] grid, char mark) {
        for (int i = 0; i < 3; i++) {
            int xCount = 0;
            int yCount = 0;
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == mark) xCount++;
                if (grid[j][i] == mark) yCount++;
            }
            if (xCount == 3 || yCount == 3) return true;
        }

        if (grid[0][0] == mark && grid[1][1] == mark && grid[2][2] == mark) return true;
        if (grid[2][0] == mark && grid[1][1] == mark && grid[0][2] == mark) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n-- > 0) {
            char[][] grid = new char[3][3];
            boolean valid = true;
            int xNum = 0;
            int oNum = 0;
            for (int i = 0; i < 3; i++) {
                grid[i] = in.next()
                            .toCharArray();
                for (int j = 0; j < 3; j++) {
                    if (grid[i][j] == 'X') {
                        xNum++;
                    } else if (grid[i][j] == 'O') oNum++;
                }
            }

            boolean xWin = win(grid, 'X');
            boolean oWin = win(grid, 'O');

            if (oNum > xNum || xNum > oNum + 1) valid = false;
            if (oWin && oNum != xNum) valid = false;
            if (xWin && xNum != oNum + 1) valid = false;

            System.out.println(valid ? "yes" : "no");
        }
    }
}
