package com.github.ciel;

import java.text.DecimalFormat;

/**
 *
 */
public class Q1517 {

    public static void main(String[] args) {
        int[] buf = new int[10];
        buf[0] = 1;
        for (int i = 1; i < 10; i++) {
            buf[i] = buf[i - 1] * i;
        }
        double[] re = new double[10];
        re[0] = 1;
        for (int i = 1; i < 10; i++) {
            re[i] = re[i - 1] + 1.0 / buf[i];
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(9);
        System.out.println("n e");
        System.out.println("- -----------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
            if (i < 4) {
                decimalFormat.setMinimumFractionDigits(0);
            } else {
                decimalFormat.setMinimumFractionDigits(9);
            }
            System.out.println(decimalFormat.format(re[i]));
        }
    }
}
