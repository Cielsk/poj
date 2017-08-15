package com.github.ciel;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Q3627 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int shelf = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int re = 0;
        for (int i = n - 1, sum = 0; i >= 0; i--) {
            sum += arr[i];
            re++;
            if (sum >= shelf) break;
        }
        System.out.println(re);
    }
}
