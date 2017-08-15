package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2498 {

    public static final int[][] buf = {
        { 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
        { 0, 3, 6, 9, 2, 5, 8, 1, 4, 7 },
        { 0, 7, 4, 1, 8, 5, 2, 9, 6, 3 }
    };
    public static final int[] factors = { 9, 3, 7 };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int count = 0; count < n; count++) {
            String num = in.next();
            int sum = 0;
            int flag = 0;
            int pivot = 0;
            for (int i = num.length() - 1, j = 0; i >= 0; i--) {
                char c = num.charAt(i);
                if (c != '?') {
                    sum += (c - '0') * factors[j];
                    j = (j + 1) % 3;
                } else {
                    flag = j;
                    pivot = i;
                    j = (j + 1) % 3;
                }
            }
            StringBuilder re = new StringBuilder(num);
            int mod = (10 - (sum % 10)) % 10;
            for (int i = 0; i < 10; i++) {
                if (mod == buf[flag][i]) {
                    char t = Integer.toString(i).charAt(0);
                    re.setCharAt(pivot, t);
                }
            }
            System.out.printf("Scenario #%d:\n", count+ 1);
            System.out.println(re.toString());
            System.out.println();
        }
    }
}
