package com.github.ciel;

/**
 *
 */
public class Q2196 {

    private static int digitSum(String num) {
        int re = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (Character.isDigit(c)) {
                re += Integer.valueOf("" + c);
            } else {
                if (Character.isUpperCase(c)) c = Character.toLowerCase(c);
                re += c - 'a' + 10;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        for (int i = 2992; i < 10000; i++) {
            int a = digitSum("" + i);
            int b = digitSum(Integer.toHexString(i));
            if (a != b) continue;
            int c = digitSum(Integer.toString(i, 12));
            if (a == c) System.out.println(i);
        }
    }
}
