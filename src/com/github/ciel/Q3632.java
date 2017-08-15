package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3632 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int t = in.nextInt();
            int max = 0;
            int min = 100;
            while (t-- > 0) {
                int tmp = in.nextInt();
                if (tmp > max) max = tmp;
                if (tmp < min) min = tmp;
            }
            System.out.println(2 * (max - min));
        }
    }
}
