package com.github.ciel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 */
public class Q2871 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        double tmp = 0;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        while (in.hasNext()) {
            double d = in.nextDouble();
            if (d == 999.0) {
                System.out.println("End of Output");
                break;
            }
            if (flag) {
                System.out.println(decimalFormat.format(d - tmp));
            }
            tmp = d;
            flag = true;
        }
    }
}
