package com.github.ciel;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 */
public class Q1002 {

    private static int toDidgit(char c) {
        int[] re = {
            2,
            2,
            2,
            3,
            3,
            3,
            4,
            4,
            4,
            5,
            5,
            5,
            6,
            6,
            6,
            7,
            -1,
            7,
            7,
            8,
            8,
            8,
            9,
            9,
            9,
            -1
        };
        c = Character.toUpperCase(c);
        return re[c - 'A'];
    }

    private static String toPhoneNumber(String str) {
        if (isValidNumber(str)) return str;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (builder.length() == 3) {
                builder.append('-');
            }
            if (Character.isDigit(c)) {
                builder.append(c);
            } else if (c != '-') {
                int t = toDidgit(c);
                if (t != -1) {
                    builder.append(toDidgit(c));
                } else {
                    builder.append('#');
                }
            }
        }
        return builder.toString();
    }

    private static boolean isValidNumber(String str) {
        if (str.charAt(3) != '-') return false;
        for (int i = 0; i < str.length(); i++) {
            if (i != 3 && !Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        TreeMap<String, Integer> buf = new TreeMap<String, Integer>();
        while (n-- > 0) {
            String str = in.nextLine();
            String key = toPhoneNumber(str);
            if (buf.containsKey(key)) {
                buf.put(key, buf.get(key) + 1);
            } else {
                buf.put(key, 1);
            }
        }
        boolean duplicate = false;
        for (Map.Entry<String, Integer> entry : buf.entrySet()) {
            if (entry.getValue() > 1) {
                duplicate = true;
                System.out.println(entry.getKey() + ' ' + entry.getValue());
            }
        }
        if (!duplicate) {
            System.out.println("No duplicates.");
        }
    }
}
