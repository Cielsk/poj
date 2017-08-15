package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Q1458 {

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] strings = line.split("\\s+");

            String a = strings[0];
            String b = strings[1];

            int len1 = a.length();
            int len2 = b.length();

            int[][] buf = new int[len1 + 1][len2 + 1];

            for (int i = 0; i <= len1; i++) {
                for (int j = 0; j <= len2; j++) {
                    if (i == 0 || j == 0) {
                        buf[i][j] = 0;
                    } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        buf[i][j] = buf[i - 1][j - 1] + 1;
                    } else {
                        buf[i][j] = max(buf[i - 1][j], buf[i][j - 1]);
                    }
                }
            }

            System.out.println(buf[len1][len2]);
        }
    }
}
