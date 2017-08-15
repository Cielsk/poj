package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3917 {

    private static int judge(char a, char b) {
        if (a == b) return 0;
        if ((a == 'R' && b == 'S') || (a == 'P' && b == 'R') || (a == 'S' && b == 'P')) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.nextLine();
            String b = in.nextLine();
            if (a.length() == 1 && b.length() == 1 && a.charAt(0) == 'E' && b.charAt(0) == 'E') {
                break;
            }

            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < a.length(); i++) {
                char t1 = a.charAt(i);
                char t2 = b.charAt(i);
                int t = judge(t1, t2);
                if (t > 0) c1++;
                else if (t < 0) c2++;
            }
            System.out.println("P1: " + c1);
            System.out.println("P2: " + c2);
        }
    }
}
