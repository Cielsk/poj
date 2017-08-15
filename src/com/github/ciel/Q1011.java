package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 */
public class Q1011 {

    private static int n;
    private static int[] sticks = new int[64];
    private static boolean[] used = new boolean[64];
    private static int length;
    private static int numOfSticks;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while ((n = Integer.parseInt(reader.readLine())) != 0) {
            int total = 0;
            String tmp = reader.readLine();
            int index = 0;
            for (String str : tmp.split(" ")) {
                int t = Integer.parseInt(str);
                total += t;
                sticks[index++] = t;
            }

            Arrays.sort(sticks, 0, n);

            for (int i = sticks[n - 1]; i <= total; i++) {
                if (total % i != 0) continue;
                length = i;
                numOfSticks = total / length;
                if (search(0, n - 1, 0)) {
                    System.out.println(i);
                    break;
                }
            }

            for (int i = 0; i < n; i++) {
                used[i] = false;
            }
        }
    }

    private static boolean search(int currentLength, int nextStick, int numOfUsedStick) {
        if (currentLength == length) {
            currentLength = 0;
            nextStick = n - 1;
            numOfUsedStick++;
        }

        if (numOfUsedStick == numOfSticks) {
            return true;
        }

        while (nextStick >= 0) {
            if (!used[nextStick]) {
                if (currentLength + sticks[nextStick] <= length) {
                    used[nextStick] = true;

                    if (search(currentLength + sticks[nextStick], nextStick - 1, numOfUsedStick)) {
                        return true;
                    }

                    used[nextStick] = false;

                    if (currentLength == 0) break;

                    if (currentLength + sticks[nextStick] == length) break;
                }
                int i = nextStick - 1;
                while (i >= 0 && sticks[i] == sticks[nextStick]) i--;
                nextStick = i;

                int sumOfLastSticks = 0;
                for (; i >= 0; i--) {
                    if (!used[i]) sumOfLastSticks += sticks[i];
                }
                if (sumOfLastSticks < length - currentLength) break;

                continue;
            }
            nextStick--;
        }

        return false;
    }
}
