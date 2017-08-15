package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2136 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[26];
        int[] space = new int[26];
        for (int i = 0; i < 4; i++) {
            String str = in.nextLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (Character.isUpperCase(c)) arr[c - 'A']++;
            }
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < 26; i++) {
            space[i] = max - arr[i];
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 26; j++) {
                if (space[j] > 0) {
                    System.out.print(" ");
                    space[j]--;
                } else {
                    System.out.print("*");
                }
                if (j != 25) System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 26; i++) {
            char c = (char) ('A' + i);
            System.out.print("" + c);
            if (i != 25) System.out.print(" ");
        }
        System.out.println();
    }
}
