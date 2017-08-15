package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3438 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String str = in.next();
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < str.length(); ) {
                int j;
                for (j = i; j < str.length() && str.charAt(j) == str.charAt(i); j++) ;
                int count = j - i;
                builder.append(count);
                builder.append(str.charAt(i));
                i = j;
            }
            System.out.println(builder.toString());
        }
    }
}
