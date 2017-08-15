package com.github.ciel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 */
public class Q1004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (int i = 0; i < 12; i++) {
            double tmp = scanner.nextDouble();
            total += tmp;
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println("$"+df.format(total/12).replaceAll(",", ""));
    }
}
