package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1118 {

    static class Point {
        int x, y;
    }

    private static boolean inSameLine(Point p1, Point p2, Point p3) {
        return (p1.x - p2.x) * (p2.y - p3.y) == (p2.x - p3.x) * (p1.y - p2.y);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            Point[] buf = new Point[n];
            for (int i = 0; i < n; i++) {
                buf[i] = new Point();
                buf[i].x = in.nextInt();
                buf[i].y = in.nextInt();
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = 0;
                    for (int k = j + 1; k < n; k++) {
                        if (inSameLine(buf[i], buf[j], buf[k])) sum++;
                    }
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println(max + 2);
        }
    }
}
