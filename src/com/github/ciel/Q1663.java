package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1663 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (x == y) {
                if (x % 2 == 0) {
                    System.out.println(x * 2);
                } else {
                    System.out.println((x - 1) * 2 + 1);
                }
            } else if (y == x - 2) {
                if (x % 2 == 0) {
                    System.out.println((x - 2) * 2 + 2);
                } else {
                    System.out.println((x - 3) * 2 + 3);
                }
            } else {
                System.out.println("No Number");
            }
        }
    }
}
