package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 *
 */
public class Q1014 {

    private static int total;
    private static int[] dp;
    private static boolean divided;


    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static void zeroOnePAck(int size, int value) {
        for (int i = total; i >= size; i--) {
            dp[i] = max(dp[i], dp[i - size] + value);
            if (dp[i] == total) {
                divided = true;
                break;
            }
        }
    }

    private static void completePack(int size, int value) {
        for (int i = size; i <= total; i++) {
            dp[i] = max(dp[i], dp[i - size] + value);
            if (dp[i] == total) {
                divided = true;
                break;
            }
        }
    }

    private static void multiplePack(int size, int value, int amount) {
        if (size * amount >= total) {
            completePack(size, value);
            return;
        }

        if (divided) return;

        for (int i = 1; i < amount; i *= 2) {
            zeroOnePAck(i * size, i * value);

            if (divided) return;

            amount -= i;
        }
        zeroOnePAck(amount * size, amount * value);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int index = 1;
        while (true) {
            String line = reader.readLine();

            String[] strings = line.split(" ");

            int[] buf = new int[6];
            total = 0;
            for (int i = 0; i < 6; i++) {
                buf[i] = Integer.parseInt(strings[i]);
                total += (i + 1) * buf[i];
            }

            if (total == 0) break;
            divided = false;

            if (total % 2 == 0) {
                total /= 2;
                dp = new int[total + 1];
                for (int i = 1; i <= total; i++) {
                    dp[i] = Integer.MIN_VALUE;
                }
                dp[0] = 0;

                for (int i = 1; i <= 6; i++) {
                    multiplePack(i, i, buf[i - 1]);
                    if (divided) break;
                }
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
