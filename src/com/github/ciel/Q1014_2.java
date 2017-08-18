package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 *
 */
public class Q1014_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int index = 1;
        int total;
        boolean divided;
        while (true) {
            String[] strings = reader.readLine()
                                     .split(" ");
            total = 0;
            int[] buf = new int[6];
            for (int i = 0; i < 6; i++) {
                buf[i] = Integer.parseInt(strings[i]);
                total += buf[i] * (i + 1);
            }

            if (total == 0) break;
            divided = false;

            if (total % 2 == 0) {
                total /= 2;
                int[] dp = new int[total + 1];
                for (int i = 1; i <= total; i++) dp[i] = -1;
                dp[0] = 0;

                for (int i = 1; i <= 6; i++) {
                    for (int j = 0; j <= total; j++) {
                        if (dp[j] >= 0) {
                            dp[j] = buf[i - 1];
                        } else {
                            dp[j] = (j < i || dp[j - i] <= 0) ? -1 : dp[j - i] - 1;
                        }
                    }
                }
                if (dp[total] >= 0) divided = true;
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
