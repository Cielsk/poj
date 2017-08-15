package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3913 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Gnomes:");
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if ((b > a && b > c) || (b < a && b < c)) {
                System.out.println("Unordered");
            } else {
                System.out.println("Ordered");
            }
        }
    }
}
