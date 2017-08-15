package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3619 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        while (m-- > 0) {
            int speed = in.nextInt();
            int time = in.nextInt();
            int rest = in.nextInt();
            int t = n / (speed * time);
            int last = n % (speed * time);
            int re = t * (time + rest);
            if (last == 0) {
                re -= rest;
            } else {
                re += last / speed;
                if (last % speed != 0) re++;
            }
            System.out.println(re);
        }
    }
}
