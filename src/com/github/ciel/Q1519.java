package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1519 {

    private static int digitalRoot(int n) {
        if (n < 10) return n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digitalRoot(sum);
    }

    private static int digitalRootOfString(String str) {
        if (str.length() == 1) return Integer.valueOf(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.valueOf("" + str.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.length() == 1 && str.charAt(0) == '0') break;
            System.out.println(digitalRoot(digitalRootOfString(str)));
        }
    }
}
