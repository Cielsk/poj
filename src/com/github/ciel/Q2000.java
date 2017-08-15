package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2000 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            int sum = 0;
            int d;
            for (d = 1; d <= n && d * (d + 1)/2 <= n; d++);
            d--;
            for (int i = 1; i <= d; i++) {
                sum += i * i;
            }
            int tmp = d * (d + 1) / 2;
            sum += (n - tmp) * (d + 1);

            System.out.println(String.format("%d %d", n, sum));
        }
    }
}
