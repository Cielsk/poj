package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1477 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int c = 1; in.hasNext(); c++) {
            int n = in.nextInt();
            if (n == 0) break;
            int[] arr = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                total += arr[i];
            }
            int avg = total / n;
            int move = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > avg) {
                    move += arr[i] - avg;
                }
            }
            System.out.println("Set #" + c);
            System.out.println("The minimum number of moves is " + move + ".");
            System.out.println();
        }
    }
}
