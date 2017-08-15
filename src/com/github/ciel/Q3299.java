package com.github.ciel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 */
public class Q3299 {

    static class Weather {

        double humidex, temperature, dewpoint;
        int flag = 0; // T D H => 1 2 4

        public Weather(String s1, double d1, String s2, double d2) {
            record(s1, d1);
            record(s2, d2);
            calculate();
        }

        private void record(String s, double d) {
            switch (s.charAt(0)) {
                case 'T':
                    temperature = d;
                    flag++;
                    break;
                case 'D':
                    dewpoint = d;
                    flag += 2;
                    break;
                case 'H':
                    humidex = d;
                    flag += 4;
                    break;
                default:
                    break;
            }
        }

        private void calculate() {
            switch (flag) {
                case 3:
                    calcHumidex();
                    break;
                case 5:
                    calcDewpoint();
                    break;
                case 6:
                    calcTemperature();
                    break;
                default:
                    break;
            }
        }

        private void calcTemperature() {
            double e = 6.11 * Math.exp(5417.7530 * (1.0 / 273.16 - 1.0 / (dewpoint + 273.16)));
            double h = 0.5555 * (e - 10);
            temperature = humidex - h;
        }

        private void calcDewpoint() {
            double h = humidex - temperature;
            double e = h / 0.5555 + 10.0;
            double tmp = Math.log(e / 6.11) / 5417.7530;
            tmp = 1.0 / 273.16 - tmp;
            dewpoint = 1 / tmp - 273.16;
        }

        private void calcHumidex() {
            double e = 6.11 * Math.exp(5417.7530 * (1.0 / 273.16 - 1.0 / (dewpoint + 273.16)));
            double h = 0.5555 * (e - 10);
            humidex = temperature + h;
        }

        @Override public String toString() {
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            return "T "
                   + decimalFormat.format(temperature)
                   + " D "
                   + decimalFormat.format(dewpoint)
                   + " H "
                   + decimalFormat.format(humidex);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s1 = in.next();
            if (s1.length() == 1 && s1.charAt(0) == 'E') break;
            double d1 = in.nextDouble();
            String s2 = in.next();
            double d2 = in.nextDouble();
            Weather weather = new Weather(s1, d1, s2, d2);
            System.out.println(weather.toString());
        }
    }
}
