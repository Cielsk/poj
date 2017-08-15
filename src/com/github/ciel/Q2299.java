package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 *
 */
public class Q2299 {

    private static long count(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static long mergeSort(int[] arr, int start, int end) {
        if (start == end) return 0L;
        int mid = (start + end) >> 1;
        long left = mergeSort(arr, start, mid);
        long right = mergeSort(arr, mid + 1, end);
        long re = left + right;

        int[] temp = new int[end - start + 1];

        int l = start;
        int r = mid + 1;
        int index = 0;
        while (l <= mid || r <= end) {
            if (r > end || (l <= mid && arr[l] < arr[r])) {
                temp[index++] = arr[l++];
            } else {
                if (l <= mid) re += mid - l + 1;
                temp[index++] = arr[r++];
            }
        }

        for (int i = start, j = 0; i <= end; i++, j++) {
            arr[i] = temp[j];
        }

        return re;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            if (n == 0) break;

            int[] buf = new int[n];
            for (int i = 0; i < n; i++) {
                line = reader.readLine();
                buf[i] = Integer.parseInt(line);
            }

            System.out.println(count(buf));
        }
    }
}
