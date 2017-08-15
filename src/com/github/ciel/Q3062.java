package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3062 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String string = in.nextLine();
            if (string == "" || string == "\n") {
                continue;
            }
            System.out.println(string);
        }
    }
}
