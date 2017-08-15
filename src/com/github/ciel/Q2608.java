package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2608 {

    private static int code(char c) {
        if (c == 'B' || c == 'F' || c == 'P' || c == 'V') return 1;
        if (c == 'C'
            || c == 'G'
            || c == 'J'
            || c == 'K'
            || c == 'Q'
            || c == 'S'
            || c == 'X'
            || c == 'Z') {
            return 2;
        }
        if (c == 'D' || c == 'T') return 3;
        if (c == 'L') return 4;
        if (c == 'M' || c == 'N') return 5;
        if (c == 'R') return 6;
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            StringBuilder builder = new StringBuilder();
            for (int i = 0, tmp = -1; i < str.length(); i++) {
                char c = str.charAt(i);
                int t = code(c);
                if (t == tmp) continue;
                if (t != 0) builder.append(t);
                tmp = t;
            }
            System.out.println(builder.toString());
        }
    }
}
