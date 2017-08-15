package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1159 {

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static int lcs(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int[][] buf = new int[2][len2 + 1];

        int t = 0;
        for (int i = 1; i <= len1; i++) {
            t = 1 - t;
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    buf[t][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    buf[t][j] = buf[1 - t][j - 1] + 1;
                } else {
                    buf[t][j] = max(buf[1 - t][j], buf[t][j - 1]);
                }
            }
        }

        return buf[t][len2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        String rev = new StringBuilder(str).reverse()
                                           .toString();
        System.out.println(str.length() - lcs(str, rev));
    }
}
