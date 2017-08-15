package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3518 {

    static final int MAX = 1299709;

    private static boolean[] buf = new boolean[MAX + 1];

    static {
        for (int i = 2; i <= (int) Math.sqrt(MAX); i++) {
            if (buf[i]) continue;
            for (int j = 2; i * j <= MAX; j++) {
                if (!buf[i * j]) buf[i * j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            if (buf[n]) {
                int left, right;
                for (left = n - 1; left >= 2 && buf[left]; left--) ;
                for (right = n + 1; right <= MAX && buf[right]; right++) ;
                System.out.println(right - left);
            } else {
                System.out.println(0);
            }
        }
    }
}
