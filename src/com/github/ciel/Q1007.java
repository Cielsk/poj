package com.github.ciel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 */
public class Q1007 {

    private static int sortedness(String string) {
        int re = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) < string.charAt(i)) {
                    re++;
                }
            }
        }
        return re;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] buf = new String[m];
        for (int i = 0; i < m; i++) {
            do {
                buf[i] = in.nextLine();
            } while (buf[i].length() != n);
        }
        sortedness(buf[0]);
        Arrays.sort(buf, new Comparator<String>() {
            @Override public int compare(String o1, String o2) {
                return sortedness(o1) - sortedness(o2);
            }
        });
        for (int i = 0; i < m; i++) {
            System.out.println(buf[i]);
        }
    }
}
