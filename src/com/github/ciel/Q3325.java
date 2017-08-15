package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3325 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int t = in.nextInt();
                if (max < t) max = t;
                if (min > t) min = t;
                sum += t;
            }
            System.out.println((sum - max - min) / (n - 2));
        }
    }
}
