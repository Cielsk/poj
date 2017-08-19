package com.github.ciel;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Q1146 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            if ("#".compareTo(word) == 0) break;

            int n = word.length();
            char[] buf = word.toCharArray();

            int p = n - 2;
            for (; p >= 0 && buf[p] >= buf[p + 1]; p--) ;

            if (p >= 0) {
                int q = n - 1;
                for (; q > p && buf[q] <= buf[p]; q--) ;

                char t = buf[p];
                buf[p] = buf[q];
                buf[q] = t;

                Arrays.sort(buf, p + 1, n);
                String re = new String(buf);

                System.out.println(re);
            } else {
                System.out.println("No Successor");
            }
        }
    }
}
