package com.github.ciel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 */
public class Q3507 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double sum = 0;
            double max = 0;
            double min = Double.MAX_VALUE;
            for (int i = 0; i < 6; i++) {
                double t = in.nextDouble();
                if (Double.compare(max, t) < 0) {
                    max = t;
                }
                if (Double.compare(min, t) > 0) {
                    min = t;
                }
                sum += t;
            }
            if (sum == 0) break;
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMinimumFractionDigits(0);
            System.out.println(decimalFormat.format((sum - max - min) / 4));
        }
    }
}
