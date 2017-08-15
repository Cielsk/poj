package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1401 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();

            int re = 0;
            while (n > 0) {
                n /= 5;
                re += n;
            }
            System.out.println(re);
        }
    }
}
