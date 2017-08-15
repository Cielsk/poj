package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3086 {

    public static void main(String[] args) {
        int[] buf = new int[302];
        int[] re = new int[301];
        buf[0] = 0;
        for (int i = 1 ; i < buf.length; i++) {
            buf[i] = buf[i - 1] + i;
        }
        re[0] = 0;
        for (int i = 1; i < re.length; i++) {
            re[i] = re[i - 1] + i*buf[i + 1];
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for ( int i = 0; i < n; i++) {
            int num = in.nextInt();
            System.out.println(String.format("%d %d %d", i + 1, num, re[num]));
        }
    }
}
