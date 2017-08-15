package com.github.ciel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 */
public class Q3637 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr, new Comparator<Integer>() {
                @Override public int compare(Integer o1, Integer o2) {
                    int a = o1;
                    int b = o2;
                    if (a < b) return 1;
                    if (a > b) return -1;
                    return 0;
                }
            });
            int re = 0;
            for (int i = 2; i < n; i+=3) {
                re += arr[i];
            }
            System.out.println(re);
        }
    }
}
