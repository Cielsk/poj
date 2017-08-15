package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3100 {

    private static int distance(int num, int n, int p) {
        return (int) Math.abs(Math.pow(p, n) - num);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int n = in.nextInt();
            if (num == 0 && n == 0) break;
            double root = (int) Math.pow(num, 1.0 / n);
            int floor = (int) Math.floor(root);
            int re = distance(num, n, floor) < distance(num, n, floor + 1) ? floor : floor + 1;
            System.out.println(re);
        }
    }
}
