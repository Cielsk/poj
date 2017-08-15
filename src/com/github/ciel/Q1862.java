package com.github.ciel;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Q1862 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int num = cin.nextInt();
        double[] arr = new double[num];

        for (int i = 0; i < num; i++)
            arr[i] = cin.nextDouble();

        Arrays.sort(arr);

        double result;
        double a, b;

        if (num == 1) {
            result = arr[0];
        } else {
            int index = num - 1;
            a = arr[index];
            b = arr[index - 1];

            result = 2 * Math.sqrt(a * b);

            for (int i = index - 2; i >= 0; i--) {
                a = arr[i];
                result = 2 * Math.sqrt(a * result);
            }
        }

        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(result));
    }
}
