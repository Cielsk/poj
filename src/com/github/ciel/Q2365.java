package com.github.ciel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 */
public class Q2365 {

    static class Point {

        double x, y;

        double distance(Point point) {
            return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double r = in.nextDouble();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Point();
            arr[i].x = in.nextDouble();
            arr[i].y = in.nextDouble();
        }
        double sum = Math.PI * r * 2 + arr[0].distance(arr[n - 1]);
        for (int i = 1; i < n; i++) {
            sum += arr[i].distance(arr[i - 1]);
        }
        DecimalFormat format = new DecimalFormat();
        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(2);
        System.out.println(format.format(sum));
    }
}
