package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1003 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double max = in.nextDouble();
            if (max == 0) {
                break;
            }
            int re = 0;
            int start = 2;
            double total = 0;
            while (total < max) {
                total += 1.0 / start;
                start++;
                re++;
            }
            System.out.println(String.format("%d card(s)", re));
        }
    }
}
