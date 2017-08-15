package com.github.ciel;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Q3075 {

    private static char[][] grid = new char[3][3];

    private static boolean win(char mark) {
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

        while (in.hasNext()) {
            String tmp = in.next();
            if ("end".compareTo(tmp) == 0) break;
            char[] buf = tmp.toCharArray();
            grid[0] = Arrays.copyOfRange(buf, 0, 3);
            grid[1] = Arrays.copyOfRange(buf, 3, 6);
            grid[2] = Arrays.copyOfRange(buf, 6, 9);

            int xNum = 0;
            int oNum = 0;
            boolean valid = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (grid[i][j] == 'X') {
                        xNum++;
                    } else if (grid[i][j] == 'O') oNum++;
                }
            }

            boolean xWin = win('X');
            boolean oWin = win('O');

            if (oNum > xNum || xNum > oNum + 1) valid = false;
            if (oWin && oNum != xNum) valid = false;
            if (xWin && xNum != oNum + 1) valid = false;
            if (!xWin && !oWin && xNum + oNum != 9) valid = false;

            System.out.println(valid ? "valid" : "invalid");
        }
    }
}
