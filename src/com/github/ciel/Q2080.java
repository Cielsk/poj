package com.github.ciel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 */
public class Q2080 {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int days = in.nextInt();
            if (days == -1) break;

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd EEEE", Locale.ENGLISH);
            Calendar calendar = new GregorianCalendar(2000, 0, 0);
            calendar.add(Calendar.DATE, days + 1);
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
