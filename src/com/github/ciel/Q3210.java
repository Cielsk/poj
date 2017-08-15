package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3210 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else if (n % 2 == 0) {
                System.out.println("No Solution!");
            } else {
                System.out.println(n - 1);
            }
        }
    }
}
