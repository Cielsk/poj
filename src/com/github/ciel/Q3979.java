package com.github.ciel;

import java.util.Scanner;

/**
 *
 */
public class Q3979 {

    static class Fraction {

        int numerator;              // 分子
        int denominator;            // 分母

        public Fraction() {
            this.numerator = 0;
            this.denominator = 1;
        }

        public Fraction(String str) {
            int i;
            for (i = 0; i < str.length() && str.charAt(i)!= '/'; i++);
            String n = str.substring(0, i);
            String d = str.substring(i + 1);
            numerator = Integer.valueOf(n);
            denominator = Integer.valueOf(d);
        }

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        private static int gcd(int a, int b) {
            while (b != 0) {
                int t = b;
                b = a % b;
                a = t;
            }
            return a;
        }

        public Fraction add(Fraction f) {
            int n = numerator * f.denominator + f.numerator * denominator;
            int d = denominator * f.denominator;
            int gcd = gcd(n, d);
            numerator = n / gcd;
            denominator = d / gcd;
            if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }
            return this;
        }

        public Fraction substract(Fraction f) {
            Fraction t = new Fraction(-f.numerator, f.denominator);
            return add(t);
        }

        @Override public String toString() {
            if (denominator == 1) {
                return "" + numerator;
            } else {
                return "" + numerator + "/" + denominator;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            int sign = 0;
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) == '-' || str.charAt(i) == '+') && (i > 0 && Character.isDigit(
                    str.charAt(i - 1)) && Character.isDigit(str.charAt(i + 1)))) {
                    sign = i;
                    break;
                }
            }
            String s1 = str.substring(0, sign);
            String s2 = str.substring(sign + 1);
            Fraction f1 = new Fraction(s1);
            Fraction f2 = new Fraction(s2);
            if (str.charAt(sign) == '+') {
                System.out.println(f1.add(f2));
            } else {
                System.out.println(f1.substract(f2));
            }
        }
    }
}
