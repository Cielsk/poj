package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2140 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int re = 1;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n && sum <= n; j++) {
                sum += j;
                if (sum == n) {
                    re++;
                    break;
                }
            }
        }
        System.out.println(re);
    }
}
