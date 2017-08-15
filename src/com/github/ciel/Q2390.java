package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2390 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rate = in.nextInt();
        int money = in.nextInt();
        int year = in.nextInt();
        double re = Math.pow(1.0 + rate * 1.0 / 100, year) * money;
        System.out.println((int) re);
    }
}
