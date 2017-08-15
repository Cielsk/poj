package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q1046 {

    static class Color {

        int r, g, b;

        Color() {
            r = g = b = 0;
        }

        @Override public String toString() {
            return String.format("(%d,%d,%d)", r, g, b);
        }
    }

    private static int distance(Color c1, Color c2) {
        return (c1.r - c2.r) * (c1.r - c2.r) + (c1.g - c2.g) * (c1.g - c2.g) + (c1.b - c2.b) * (c1.b
                                                                                                - c2.b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Color[] buf = new Color[16];
        for (int i = 0; i < 16; i++) {
            buf[i] = new Color();
            buf[i].r = in.nextInt();
            buf[i].g = in.nextInt();
            buf[i].b = in.nextInt();
        }
        while (in.hasNext()) {
            Color c = new Color();
            c.r = in.nextInt();
            c.g = in.nextInt();
            c.b = in.nextInt();
            if (c.r == -1 && c.g == -1 && c.b == -1) break;
            int min = 0;
            int tmp = Integer.MAX_VALUE;
            for (int i = 0; i < 16; i++) {
                if (buf[i].r == c.r && buf[i].g == c.g && buf[i].b == c.b) {
                    min = i;
                    break;
                }
                int d = distance(buf[i], c);
                if (d < tmp) {
                    tmp = d;
                    min = i;
                }
            }
            System.out.println(c + " maps to " + buf[min]);
        }
    }
}
