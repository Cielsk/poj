package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3094 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.length() == 1 && str.charAt(0) == '#') break;
            str = str.toUpperCase();
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                int tmp = str.charAt(i) == ' ' ? 0 : str.charAt(i) - 'A' + 1;
                sum += (i + 1) * tmp;
            }
            System.out.println(sum);
        }
    }
}
