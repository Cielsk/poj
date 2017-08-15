package com.github.ciel;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 */
public class Q2506 {

    private static BigInteger[] buf = new BigInteger[251];

    static {
        buf[0] = BigInteger.ONE;
        buf[1] = BigInteger.ONE;
        buf[2] = new BigInteger("3");
    }

    private static BigInteger till(int n) {
        if (buf[n] != null) return buf[n];
        buf[n] = till(n - 1).add(till(n - 2))
                            .add(till(n - 2));
        return buf[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(till(n));
        }
    }
}
