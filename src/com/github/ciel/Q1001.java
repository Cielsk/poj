package com.github.ciel;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 */
public class Q1001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            BigDecimal r = in.nextBigDecimal();
            int p = in.nextInt();
            String re = r.pow(p).stripTrailingZeros().toPlainString();
            if (re.charAt(0) == '0') {
                re = re.substring(1);
            }
            System.out.println(re);
        }
    }
}
