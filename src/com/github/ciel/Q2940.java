package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2940 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            long re = 0;
            long tmp = 0;
            while (n-- > 0) {
                tmp += in.nextLong();
                re += Math.abs(tmp);
            }
            System.out.println(re);
        }
    }
}
