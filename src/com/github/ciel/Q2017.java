package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2017 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == -1) break;
            int sum = 0;
            int time = 0;
            while (n-- > 0) {
                int a = in.nextInt();
                int b = in.nextInt();
                sum += a * (b - time);
                time = b;
            }
            System.out.println(String.format("%d miles", sum));
        }
    }
}
