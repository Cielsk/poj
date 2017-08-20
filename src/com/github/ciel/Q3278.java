package com.github.ciel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 */
public class Q3278 {

    private static final int MAX = 200000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(bfs(a, b));
    }

    private static int bfs(int a, int b) {
        if (a == b) return 0;
        if (a > b) return  a - b;

        Queue<Integer> buf = new LinkedList<Integer>();
        boolean[] visited = new boolean[MAX + 1];
        int[] step = new int[MAX + 1];
        buf.add(a);
        visited[a] = true;

        while (!buf.isEmpty()) {
            int head = buf.poll();

            if (head == b) return step[head];

            int[] children = { head - 1, head + 1, head * 2 };
            for (int i = 0; i < 3; i++) {
                if (children[i] >= 0 && children[i] <= MAX && !visited[children[i]]) {
                    buf.add(children[i]);
                    visited[children[i]] = true;
                    step[children[i]] = step[head] + 1;
                }
                if (children[i] == b) return step[children[i]];
            }
        }
        return 0;
    }
}
