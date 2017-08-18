package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 *
 */
public class Q1014_1 {

    private static int buf[] = new int[6];
    private static int total;
    private static boolean divided;

    private static void dfs(int value, int number) {
        if (divided) return;

        if (value == total / 2) {
            divided = true;
            return;
        }

        for (int i = number; i >= 1; i--) {
            if (buf[i - 1] != 0) {
                if (value + i <= total / 2) {
                    buf[i - 1]--;
                    dfs(value + i, i);

                    if (divided) break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int index = 1;
        while (true) {
            String[] strings = reader.readLine()
                                     .split(" ");
            total = 0;
            for (int i = 0; i < 6; i++) {
                buf[i] = Integer.parseInt(strings[i]);
                total += buf[i] * (i + 1);
            }

            if (total == 0) break;
            divided = false;

            if (total % 2 == 0) {
                dfs(0, 6);
            }

            System.out.printf("Collection #%d:\n", index++);
            if (divided) {
                System.out.print("Can");
            } else {
                System.out.print("Can't");
            }
            System.out.println(" be divided.");
            System.out.println();
        }
    }
}
