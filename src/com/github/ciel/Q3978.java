package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3978 {

    private static final boolean[] buf = new boolean[100000];

    static {
        buf[0] = true;
        buf[1] = true;
        for (int i = 2; i <= Math.sqrt(100000); i++) {
            if (buf[i]) continue;
            for (int j = i; i * j < 100000; j++) {
                if (!buf[i * j]) buf[i * j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == -1 && b == -1) break;
            if (a < 0) a = 0;
            int count = 0;
            for (int i = a; i <= b; i++) {
                if (!buf[i]) count++;
            }
            System.out.println(count);
        }
    }
}
