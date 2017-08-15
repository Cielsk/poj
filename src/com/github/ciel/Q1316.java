package com.github.ciel;

/**
 *
 */
public class Q1316 {

    private static int calc(int n) {
        int re = n;
        while (n > 0) {
            re += n % 10;
            n /= 10;
        }
        return re;
    }

    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            for (int j = calc(i); j <= 10000; j = calc(j)) {
                if (!arr[j]) arr[j] = true;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (!arr[i]) System.out.println(i);
        }
    }
}
