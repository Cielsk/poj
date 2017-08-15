package com.github.ciel;

import java.util.Scanner;

/**
 *
 *
 */
public class Q1552 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int a = scan.nextInt();
            int[] array = new int[16];
            if (a == -1) {
                break;
            }
            int i = 0;
            while (a != 0) {
                array[i] = a;
                if (scan.hasNext()) {
                    a = scan.nextInt();
                    i++;
                }
            }
            array[i] = 0;
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                int aa = array[j] * 2;
                if (aa == 0) {
                    break;
                }
                for (int k = 0; k < array.length; k++) {
                    if (array[k] == 0) {
                        break;
                    }
                    if (array[k] == aa) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}