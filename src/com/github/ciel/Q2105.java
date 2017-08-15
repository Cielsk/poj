package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2105 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String str = in.next();
            int a = Integer.valueOf(str.substring(0, 8), 2);
            int b = Integer.valueOf(str.substring(8, 16), 2);
            int c = Integer.valueOf(str.substring(16, 24), 2);
            int d = Integer.valueOf(str.substring(24), 2);
            System.out.printf("%d.%d.%d.%d\n", a, b, c, d);
        }
    }
}
