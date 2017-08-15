package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3077 {

    private static boolean toAdd(String str, int index) {
        if (index >= str.length() - 1 || index < 0) return false;
        int t = Integer.valueOf(str.substring(index + 1, index + 2));
        if (t < 4) return false;
        if (t > 4) return true;
        return toAdd(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String str = in.next();
            if (str.length() == 1) {
                System.out.println(str);
            } else {
                StringBuilder builder = new StringBuilder();
                int num = Integer.valueOf(str.substring(0, 1));
                if (toAdd(str, 0)) num++;
                builder.append(num);
                for (int i = 0; i < str.length() - 1; i++) {
                    builder.append(0);
                }
                System.out.println(builder.toString());
            }
        }
    }
}
