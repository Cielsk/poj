package com.github.ciel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class Q3750 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> children = new LinkedList<String>();
        for (int i = 0; i < n; i++) {
            children.add(in.next());
        }
        String temp = in.next();
        int t = 0;
        while (temp.charAt(t) != ',') t++;
        int w = Integer.valueOf(temp.substring(0, t));
        int s = Integer.valueOf(temp.substring(t + 1));

        int start = w - 1;
        while (children.size() > 1) {
            int out = (start + s - 1) % children.size();
            System.out.println(children.remove(out));
            start = out >= children.size() ? 0 : out;
        }
        System.out.println(children.get(0));
    }
}
