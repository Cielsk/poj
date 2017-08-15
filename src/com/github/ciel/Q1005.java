package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1005 {

    public static void main(String[] args) {
        int speed = 50;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            double s = Math.PI * (x * x + y * y) / 2;
            double tmp = s / speed;
            int re = (int) tmp;
            if (tmp > re) re++;
            System.out.println(String.format(
                "Property %d: This property will begin eroding in year %d.",
                i + 1,
                re));
        }
        System.out.println("END OF OUTPUT.");
    }
}
