package com.github.ciel;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Q2291 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] buf = new int[n];
            for (int i = 0; i < n; i++) {
                buf[i] = in.nextInt();
            }
            Arrays.sort(buf);

            int max = 0;
            for (int i = 0; i < n; i++) {
                int tmp = (n - i) * buf[i];
                if (tmp > max) max = tmp;
            }
            System.out.println(max);
        }
    }
}
