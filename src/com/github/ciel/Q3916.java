package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3916 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            int[] arr = new int[n];
            for (int i = 0, t = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] == t) {
                    arr[i] = 0;
                } else {
                    t = arr[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    System.out.printf("%d ", arr[i]);
                }
            }
            System.out.println("$");
        }
    }
}
