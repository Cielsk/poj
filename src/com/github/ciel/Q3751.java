package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3751 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String str = in.next();
            StringBuilder builder = new StringBuilder();
            builder.append(str.substring(5, 10));
            builder.append('/');
            builder.append(str.substring(0, 4));
            builder.append('-');
            int hour = Integer.valueOf(str.substring(11, 13));
            String tmp;
            if (hour == 12) {
                builder.append(hour);
                tmp = "pm";
            } else if (hour == 0) {
                builder.append(12);
                tmp = "am";
            } else if (hour < 12) {
                builder.append(hour < 10 ? "0" + hour : hour);
                tmp = "am";
            } else {
                int t = hour - 12;
                builder.append(t < 10 ? "0" + t : t);
                tmp = "pm";
            }
            builder.append(str.substring(13));
            builder.append(tmp);
            System.out.println(builder.toString());
        }
    }
}
