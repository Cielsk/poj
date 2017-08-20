package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 *
 */
public class Q2533 {

    private static int dp(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = max(dp[i], dp[j] + 1);
            }
        }

        return max(dp);
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static int max(int[] arr) {
        int re = 0;
        for (int anArr : arr) {
            if (anArr > re) re = anArr;
        }
        return re;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = reader.readLine();
        int n = Integer.parseInt(line);

        int[] buf = new int[n];

        line = reader.readLine();
        String[] temp = line.split("\\s");
        for (int i = 0; i < n; i++) {
            buf[i] = Integer.parseInt(temp[i]);
        }

        System.out.println(dp(buf));
    }
}
