package com.github.ciel;

import java.io.BufferedInputStream;
import java.io.IOException;

/**
 *
 */
public class Q2602 {

    public static void main(String[] args) throws IOException {
        BufferedInputStream read = new BufferedInputStream(System.in);
        byte[] b = new byte[5000007];
        read.read(b);
        StringBuilder s = new StringBuilder();
        int index = 0;
        while (b[index] != '\r') {
            s.append((char) b[index]);
            index++;
        }
        int n = Integer.parseInt(s.toString());
        byte[] c = new byte[n];
        for (int i = 0; i < n; i++) {
            index++;
            index++;
            c[i] += b[index] - 48;
            index++;
            index++;
            c[i] += b[index] - 48;
            index++;
        }
        int cf = 0;
        for (int i = n - 1; i >= 0; i--) {
            c[i] += cf;
            if (c[i] >= 10) {
                cf = 1;
                c[i] += 38;
            } else {
                cf = 0;
                c[i] += 48;
            }
        }
        System.out.write(c);
        System.out.println();
    }
}
