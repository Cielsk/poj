package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1012 {

    public static final int[] buf = new int[14];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int k = in.nextInt();
            if (k == 0) break;

            if (buf[k] != 0) {
                System.out.println(buf[k]);
            } else {
                int n = k + k;
                int[] tmp = new int[15];

                int re = 1;
                for (int i = 1; i <= k; i++) {
                    tmp[i] = (tmp[i - 1] + re - 1) % (n - i + 1);

                    if (tmp[i] < k) {
                        i = 0;
                        re++;
                    }
                }
                buf[k] = re;
                System.out.println(re);
            }
        }
    }
}
