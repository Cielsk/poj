package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1218 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int num = in.nextInt();
            boolean[] jail = new boolean[num + 1];
            for (int i = 2; i <= num; i++) {
                for (int j = i; j <= num; j += i) {
                    jail[j] = !jail[j];
                }
            }
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (!jail[i]) count++;
            }
            System.out.println(count);
        }
    }
}
