package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1844 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int start = (int) Math.sqrt(2 * s);
        for (int i = start; i <= s; i++) {
            if ((i + 1) * i / 2 >= s && s % 2 == i * (i + 1) / 2 % 2) {
                System.out.println(i);
                break;
            }
        }
    }
}
