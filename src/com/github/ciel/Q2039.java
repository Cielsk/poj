package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2039 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            String str = in.next();
            int m = str.length() / n;
            char[][] arr = new char[m][n];
            for (int i = 0, c = 0; i < m; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = str.charAt(c++);
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        arr[i][j] = str.charAt(c++);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[j][i]);
                }
            }
            System.out.println();
        }
    }
}
