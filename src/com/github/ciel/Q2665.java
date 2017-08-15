package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2665 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long total = in.nextLong();
            int n = in.nextInt();
            if (total == 0 && n == 0) break;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                long start = in.nextLong();
                long end = in.nextLong();
                sum += end - start + 1;
            }
            System.out.println(total + 1 - sum);
        }
    }
}
