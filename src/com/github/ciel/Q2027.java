package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2027 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a >= b) {
                System.out.println("MMM BRAINS");
            } else {
                System.out.println("NO BRAINS");
            }
        }
    }
}
