package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1045 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vs = in.nextDouble();
        double r = in.nextDouble();
        double c = in.nextDouble();
        int n = in.nextInt();
        while (n-- > 0) {
            double w = in.nextDouble();
            double vr = c * r * vs * w / Math.sqrt(1 + c * c * r * r * w * w);
            System.out.printf("%.3f\n", vr);
        }
    }
}
