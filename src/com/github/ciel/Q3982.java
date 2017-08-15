package com.github.ciel;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 */
public class Q3982 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            BigInteger a1 = in.nextBigInteger();
            BigInteger a2 = in.nextBigInteger();
            BigInteger a3 = in.nextBigInteger();
            BigInteger re = BigInteger.ZERO;
            for (int i = 3; i < 100; i++) {
                re = a1.add(a2)
                       .add(a3);
                a1 = a2;
                a2 = a3;
                a3 = re;
            }
            System.out.println(re);
        }
    }
}
