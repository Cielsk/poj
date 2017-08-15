package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3386 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int a1 = in.nextInt();
        int b = in.nextInt();
        int b1 = in.nextInt();
        int p = in.nextInt();
        if ((a <= p && a1 >= b) || (b <= p && b1 >= a) || a + b <= p) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
