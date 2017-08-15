package com.github.ciel;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 */
public class Q1503 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger sum = BigInteger.ZERO;
        while (in.hasNext()) {
            BigInteger num = in.nextBigInteger();
            if (num.compareTo(BigInteger.ZERO) == 0) break;
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
