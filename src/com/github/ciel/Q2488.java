package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2488 {

    static class Node {

        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int p, q;
    private static boolean flag;
    public static final int[][] path = new int[26][2];
    private static final boolean[][] visited = new boolean[26][26];
    private static final int[][] vector = {
        { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 }, { 1, -2 }, { 1, 2 }, { 2, -1 }, { 2, 1 }
    };

    private static String translate(Node node) {
        char c = (char) ('A' + node.y);
        return String.valueOf(c) + (node.x + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            p = in.nextInt();
            q = in.nextInt();
            flag = false;

            for (int j = 0; j < p; j++) {
                for (int k = 0; k < q; k++) {
                    visited[j][k] = false;
                }
            }

            System.out.printf("Scenario #%d:\n", i + 1);
            visited[0][0] = true;
            path[0][0] = 0;
            path[0][1] = 0;
            dfs(0, 0, 1);
            if (!flag) System.out.println("impossible");
            System.out.println();
        }
    }

    private static void dfs(int a, int b, int count) {
        if (count == p * q) {
            for (int i = 0; i < count; i++) {
                char c = (char) (path[i][0] + 'A');
                System.out.print(String.valueOf(c) + (path[i][1] + 1));
            }
            System.out.println();
            flag = true;
        } else {
            for (int[] aVector : vector) {
                int x = a + aVector[0];
                int y = b + aVector[1];
                if (x >= 0 && x < q && y >= 0 && y < p && !visited[x][y] && !flag) {
                    visited[x][y] = true;
                    path[count][0] = x;
                    path[count][1] = y;
                    dfs(x, y, count + 1);
                    visited[x][y] = false;
                }
            }
        }
    }
}
