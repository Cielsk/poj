package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1543 {

    private static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 6; i <= n; i++) {
            int left = cube(i);
            for (int j = 2; j < i; j++) {
                int right = cube(j);
                for (int k = j; k < i; k++) {
                    right += cube(k);
                    for (int m = k; m < i; m++) {
                        right += cube(m);
                        if (left == right) {
                            System.out.printf("Cube = %d, Triple = (%d,%d,%d)\n", i, j, k, m);
                        } else if (right > left) {
                            right -= cube(m);
                            break;
                        }
                        right -= cube(m);
                    }
                    right -= cube(k);
                }
            }
        }
    }
}
