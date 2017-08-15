package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1658 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = in.nextInt();
            }
            boolean flag = true;
            for (int i = 2, tmp = arr[1] - arr[0]; i < 4; i++) {
                if (arr[i] - arr[i-1] != tmp) {
                    flag = false;
                    break;
                }
            }
            for (int a : arr) {
                System.out.printf("%d ", a);
            }
            if (flag) {
                System.out.println(arr[3] + arr[1] - arr[0]);
            } else {
                System.out.println(arr[3] * arr[1] / arr[0]);
            }
        }
    }
}
