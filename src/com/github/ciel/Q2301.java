package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2301 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int add = in.nextInt();
            int sub = in.nextInt();
            if (add < sub || (add+sub) % 2 != 0 || (add-sub) % 2 != 0) {
                System.out.println("impossible");
            } else {
                int a = (add + sub) / 2;
                int b = (add - sub) / 2;
                System.out.printf("%d %d\n", a, b);
            }
        }
    }
}
