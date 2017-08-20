package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.System.in;

/**
 *
 */
public class Q1164 {

    private static int count;
    private static int maxSquare;
    private static int[][] map;
    private static boolean[][] visited;
    private static int m, n;

    private static class Cell {

        int x, y;

        Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void traverse() {
        visited = new boolean[m][n];
        count = 0;
        maxSquare = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) continue;
                int square = bfs(i, j);
                count++;
                if (square > maxSquare) maxSquare = square;
            }
        }
    }

    private static int bfs(int x, int y) {
        int square = 0;
        Queue<Cell> toVisit = new LinkedList<Cell>();
        toVisit.add(new Cell(x, y));
        visited[x][y] = true;

        while (!toVisit.isEmpty()) {
            Cell head = toVisit.poll();
            square++;
            List<Cell> next = next(head);
            toVisit.addAll(next);
        }

        return square;
    }

    private static List<Cell> next(Cell cell) {
        int[][] move = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 } };
        List<Cell> temp = new ArrayList<Cell>();

        int t = map[cell.x][cell.y];
        for (int i = 0; i < 4; i++, t /= 2) {
            if (t % 2 == 1) continue;
            int x = move[i][0] + cell.x;
            int y = move[i][1] + cell.y;
            if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) continue;
            temp.add(new Cell(x, y));
            visited[x][y] = true;
        }

        return Collections.unmodifiableList(temp);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line = reader.readLine();
        m = Integer.parseInt(line);
        line = reader.readLine();
        n = Integer.parseInt(line);

        map = new int[m][n];
        for (int i = 0; i < m; i++) {
            line = reader.readLine();
            String[] temp = line.split("\\s");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

        traverse();
        System.out.println(count);
        System.out.println(maxSquare);
    }
}
