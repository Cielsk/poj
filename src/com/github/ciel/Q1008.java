package com.github.ciel;

import java.util.ArrayList;
import java.util.Scanner;

class Q1008 {

    public static void main(String[] args) {
        String[] Haab = new String[] {
            "pop",
            "no",
            "zip",
            "zotz",
            "tzec",
            "xul",
            "yoxkin",
            "mol",
            "chen",
            "yax",
            "zac",
            "ceh",
            "mac",
            "kankin",
            "muan",
            "pax",
            "koyab",
            "cumhu",
            "uayet"
        };
        ArrayList<String> HaabList = new ArrayList<String>();
        for (int i = 0; i < Haab.length; i++) {
            HaabList.add(Haab[i]);
        }
        String[] Tzolkin = new String[] {
            "imix",
            "ik",
            "akbal",
            "kan",
            "chicchan",
            "cimi",
            "manik",
            "lamat",
            "muluk",
            "ok",
            "chuen",
            "eb",
            "ben",
            "ix",
            "mem",
            "cib",
            "caban",
            "eznab",
            "canac",
            "ahau"
        };
        Scanner in = new Scanner(System.in);
        int ncase = in.nextInt();
        System.out.println(ncase);
        while (ncase-- != 0) {
            String strHDay = in.next();
            int hDay = Integer.parseInt(strHDay.substring(0, strHDay.length() - 1));
            int hDays = HaabList.indexOf(in.next()) * 20 + hDay + 365 * in.nextInt();
            int tYear = hDays / 260;
            String tMonth = Tzolkin[hDays % 20];
            int tDay = hDays % 13 + 1;
            System.out.println(tDay + " " + tMonth + " " + tYear);
        }
    }
}