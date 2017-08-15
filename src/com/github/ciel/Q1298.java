package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1298 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String buf = "VWXYZABCDEFGHIJKLMNOPQRSTU";
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.equals("START") || str.equals("END")) continue;
            if (str.equals("ENDOFINPUT")) break;
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    builder.append(buf.charAt(c - 'A'));
                } else {
                    builder.append(c);
                }
            }
            System.out.println(builder.toString());
        }
    }
}
