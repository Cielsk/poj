package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1299 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            if ("START".compareTo(str) == 0) {
                int radius = in.nextInt();
                int gas = in.nextInt();
                int angle = in.nextInt() % 360;
                in.next();
                angle = angle > 180 ? 360 - angle : angle;
                int lenth = (int) Math.ceil(Math.PI * radius * angle / 90);
                if (lenth > gas * 5) {
                    System.out.println("NO " + (gas * 5));
                } else {
                    System.out.println("YES " + ((gas * 5 - lenth) / 5));
                }
            } else if ("ENDOFINPUT".compareTo(str) == 0) break;
        }
    }
}
