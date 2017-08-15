package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3994 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 1;
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            System.out.printf("%d. ", count++);
            int n1 = 3 * n;
            int n2;
            if (n1 % 2 == 0) {
                System.out.print("even ");
                n2 = n1 / 2;
            } else {
                System.out.print("odd ");
                n2 = (n1 + 1) / 2;
            }
            int n4 = 3 * n2 / 9;
            System.out.println(n4);
        }
    }
}
