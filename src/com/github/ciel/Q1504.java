package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1504 {

    private static int reverse(int num) {
        StringBuilder temp = new StringBuilder(Integer.toString(num));
        return Integer.valueOf(temp.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(reverse(reverse(a) + reverse(b)));
        }
    }
}
