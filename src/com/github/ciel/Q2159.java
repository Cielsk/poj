package com.github.ciel;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Q2159 {

    private static int[] calc(String str) {
        int[] tmp = new int[26];
        for (int i = 0; i < str.length(); i++) {
            tmp[str.charAt(i) - 'A']++;
        }
        Arrays.sort(tmp);
        return tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encrypt = in.next();
        String original = in.next();
        if (Arrays.equals(calc(encrypt), calc(original))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
