package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1547 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == -1) break;
            int max = 0;
            int min = 250;
            String maxName = "";
            String minName = "";
            for (int i = 0; i < n; i++) {
                int cub = in.nextInt() * in.nextInt() * in.nextInt();
                String name = in.next();
                if (cub > max) {
                    max = cub;
                    maxName = name;
                }
                if (cub < min) {
                    min = cub;
                    minName = name;
                }
            }
            System.out.println(maxName + " took clay from " + minName + ".");
        }
    }
}
