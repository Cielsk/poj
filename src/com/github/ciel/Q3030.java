package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3030 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (a > b - c) {
                System.out.println("do not advertise");
            } else if (a == b - c) {
                System.out.println("does not matter");
            } else {
                System.out.println("advertise");
            }
        }
    }
}
