package com.github.ciel;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 */
public class Q2924 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            if (a.compareTo(b) > 0) {
                BigInteger t = a;
                a = b;
                b = t;
            }
            BigInteger re = (a.add(b)).multiply((b.subtract(a)).add(BigInteger.ONE));
            re = re.divide(BigInteger.valueOf(2));
            System.out.println("Scenario #" + (i + 1) + ":");
            System.out.println(re);
            System.out.println();
        }
    }
}
