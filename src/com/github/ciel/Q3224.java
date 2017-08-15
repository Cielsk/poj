package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3224 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int re = -1;
        for (int i = 0; i < n; i++) {
            int win = 0;
            for (int j = 0; j < n; j++) {
                int t = in.nextInt();
                if (t == 3) win++;
            }
            if (win > max) {
                max = win;
                re = i + 1;
            }
        }
        System.out.println(re);
    }
}
