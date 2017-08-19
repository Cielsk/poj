package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1068 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] buf = new int[n];
            for (int i = 0; i < n; i++) {
                buf[i] = in.nextInt();
            }

            StringBuilder builder = new StringBuilder();
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < buf[i] - temp; j++) {
                    builder.append('(');
                }
                builder.append(')');
                temp = buf[i];
            }

            char[] chars = builder.toString()
                                  .toCharArray();
            builder = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '(') continue;

                int right = 0;
                int left = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (chars[j] == '(') {
                        left++;
                    } else {
                        right++;
                    }
                    if (left == right + 1) {
                        builder.append(left);
                        builder.append(' ');
                        break;
                    }
                }
            }
            builder.deleteCharAt(builder.length() - 1);
            System.out.println(builder.toString());
        }
    }
}
