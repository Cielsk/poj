package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1528 {

    private static int sumOfDivisors(int n) {
        int re = 1;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                re += i + n / i;
            }
        }
        if (n % sqrt == 0 && sqrt * sqrt == n) re -= sqrt;
        return re;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PERFECTION OUTPUT");
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            int t = sumOfDivisors(n);
            String str;
            if (n == t) {
                str = "PERFECT";
            } else if (n > t) {
                str = "DEFICIENT";
            } else {
                str = "ABUNDANT";
            }
            System.out.println(String.format("%5d  %s", n, str));
        }
        System.out.println("END OF OUTPUT");
    }
}
