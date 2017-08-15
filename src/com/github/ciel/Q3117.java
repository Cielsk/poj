package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3117 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            if (n == 0 && m == 0) break;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                in.next();
                sum += in.nextInt();
            }
            System.out.println(3 * m - sum);
        }
    }
}
