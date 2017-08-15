package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Q2941 {

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(is);
        while (true) {
            String s = in.readLine();
            int a = Integer.parseInt(s);
            if (a == 0) break;
            int[][] arr = new int[a][a];
            String[] ss;
            for (int i = 0; i < a; i++) {
                ss = in.readLine()
                       .split(" ");
                for (int j = 0; j < a; j++)
                    arr[i][j] = Integer.parseInt(ss[j]);
            }
            boolean flag = true;
            for (int i = 0; i < a - 1 && flag; i++) {
                int k = arr[i][0] - arr[i + 1][0];
                for (int j = 1; j < a; j++) {
                    if (k != arr[i][j] - arr[i + 1][j]) {
                        flag = false;
                        break;
                    }
                }
            }
            System.out.println((flag ? "" : "not ") + "homogeneous");
        }
    }
}
