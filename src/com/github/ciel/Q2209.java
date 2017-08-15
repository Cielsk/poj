package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2209 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (p % 2 == 0 || t > 0) sum += (int) Math.pow(t, p);
        }
        System.out.println(sum);
    }
}
