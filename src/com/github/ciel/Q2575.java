package com.github.ciel;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Q2575 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int[] tmp = new int[n - 1];
            for (int i = 1; i < n; i++) {
                tmp[i - 1] = Math.abs(arr[i] - arr[i - 1]);
            }
            Arrays.sort(tmp);
            boolean flag = true;
            for (int i = 0; i < n - 1 && flag; i++) {
                if (tmp[i] != i + 1) flag = false;
            }
            System.out.println(flag ? "Jolly" : "Not jolly");
        }
    }
}
