package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2636 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int k = in.nextInt();
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += in.nextInt();
            }
            System.out.println(sum - k + 1);
        }
    }
}
