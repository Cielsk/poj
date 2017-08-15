package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1936 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str1 = in.next();
            String str2 = in.next();
            int len1 = str1.length();
            int len2 = str2.length();
            int i, j;
            for (i = 0, j = 0; i < len1 && j < len2; j++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(j);
                if (c1 == c2) i++;
            }
            System.out.println(i == len1 ? "Yes" : "No");
        }
    }
}
