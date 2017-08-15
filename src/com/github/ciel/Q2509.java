package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2509 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int sum = n;
            while (n / k != 0) {
                sum += n / k;
                n = n / k + n % k;
            }
            System.out.println(sum);
        }
    }
}
