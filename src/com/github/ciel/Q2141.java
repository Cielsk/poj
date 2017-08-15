package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q2141 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        String content = in.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (Character.isLowerCase(c)) {
                char t = key.charAt(c - 'a');
                builder.append(Character.toLowerCase(t));
            } else if (Character.isUpperCase(c)) {
                char t = key.charAt(c - 'A');
                builder.append(Character.toUpperCase(t));
            } else {
                builder.append(c);
            }
        }
        System.out.println(builder.toString());
    }
}
