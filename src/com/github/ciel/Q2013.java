package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2013 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.next();
            }
            System.out.printf("SET %d\n", count++);
            for (int i = 0; i < n; i += 2) {
                System.out.println(arr[i]);
            }
            for (int i = n % 2 == 0 ? n - 1 : n - 2; i > 0; i -= 2) {
                System.out.println(arr[i]);
            }
        }
    }
}
