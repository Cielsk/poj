package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3650 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.length() == 1 && str.charAt(0) == '#') break;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                switch (c) {
                    case ' ':
                        System.out.print("%20");
                        break;
                    case '!':
                        System.out.print("%21");
                        break;
                    case '$':
                        System.out.print("%24");
                        break;
                    case '%':
                        System.out.print("%25");
                        break;
                    case '(':
                        System.out.print("%28");
                        break;
                    case ')':
                        System.out.print("%29");
                        break;
                    case '*':
                        System.out.print("%2a");
                        break;
                    default:
                        System.out.print(c);
                        break;
                }
            }
            System.out.println();
        }
    }
}
