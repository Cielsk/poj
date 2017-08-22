package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1426 {

    private static boolean found = false;

    private static void dfs(int n, long m, int count) {
        if (found) return;
        if (m % n == 0) {
            System.out.println(m);
            found = true;
            return;
        }

        if (count == 18 || m < 0) return;
        dfs(n, m * 10, count + 1);
        dfs(n, m * 10 + 1, count + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            found = false;
            dfs(n, 1, 0);
        }
    }
}
