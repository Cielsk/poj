package com.github.ciel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 */
public class Q1051 {

    private static final String[] alphabet = {
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    };

    private static final String UNDERSCORE = "..--";
    private static final String COMMA = ".-.-";
    private static final String PERIOD = "---.";
    private static final String QUESTION_MARK = "----";

    private static final Map<String, Character> hashTable = new HashMap<String, Character>();

    static {
        for (int i = 0; i < 26; i++) {
            char c = (char) ('A' + i);
            hashTable.put(alphabet[i], c);
        }
        hashTable.put(UNDERSCORE, '_');
        hashTable.put(COMMA, ',');
        hashTable.put(PERIOD, '.');
        hashTable.put(QUESTION_MARK, '?');
    }

    private static String morseCode(char c) {
        if (Character.isUpperCase(c)) {
            return alphabet[c - 'A'];
        }

        switch (c) {
            case '_':
                return UNDERSCORE;
            case ',':
                return COMMA;
            case '.':
                return PERIOD;
            case '?':
                return QUESTION_MARK;
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int index = 1; index <= t; index++) {
            String str = in.next();
            int n = str.length();
            int[] nums = new int[n];

            StringBuilder buf = new StringBuilder();
            for (int i = 0; i < n; i++) {
                String code = morseCode(str.charAt(i));
                buf.append(code);
                nums[n - 1 - i] = code.length();
            }

            StringBuilder re = new StringBuilder();
            for (int i = 0, start = 0; i < n; i++) {
                String code = buf.substring(start, nums[i] + start);
                start = nums[i] + start;
                re.append(hashTable.get(code));
            }

            System.out.printf("%d: ", index);
            System.out.println(re.toString());
        }
    }
}
