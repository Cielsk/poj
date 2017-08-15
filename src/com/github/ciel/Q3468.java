package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 *
 */
public class Q3468 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String tmp = reader.readLine();
        String[] t = tmp.split(" ");
        int n = Integer.parseInt(t[0]);
        int q = Integer.parseInt(t[1]);
        SegTree segTree = new SegTree();
        segTree.build(1, n, 1);

        int[] nums = new int[n];
        tmp = reader.readLine();
        t = tmp.split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(t[i]);
            segTree.update(i + 1, i + 1, nums[i], 1);
        }

        for (int i = 0; i < q; i++) {
            tmp = reader.readLine();
            t = tmp.split(" ");

            switch (t[0].charAt(0)) {
                case 'Q':
                    int x = Integer.parseInt(t[1]);
                    int y = Integer.parseInt(t[2]);
                    System.out.println(segTree.query(x, y, 1));
                    break;
                case 'C':
                    int a = Integer.parseInt(t[1]);
                    int b = Integer.parseInt(t[2]);
                    int c = Integer.parseInt(t[3]);
                    segTree.update(a, b, c, 1);
                    break;
                default:
                    break;
            }
        }
    }
}

class Node {

    public int left, right;
    public long sum;
    public long add;
}

class SegTree {

    public static final int MAX = 100010;
    private Node[] buffer = new Node[MAX << 2];

    private static int mid(int l, int r) {
        return (l + r) >> 1;
    }

    private static int leftChild(int i) {
        return i << 1;
    }

    private static int rightChild(int i) {
        return i << 1 | 1;
    }

    public void build(int l, int r, int i) {
        if (buffer[i] == null) buffer[i] = new Node();
        buffer[i].left = l;
        buffer[i].right = r;
        buffer[i].add = 0;

        if (l == r) return;
        int mid = mid(l, r);
        build(l, mid, leftChild(i));
        build(mid + 1, r, rightChild(i));
        buffer[i].sum = buffer[leftChild(i)].sum + buffer[rightChild(i)].sum;
    }

    public void update(int l, int r, long add, int i) {
        if (buffer[i].right < l || buffer[i].left > r) return;

        if (buffer[i].left >= l && buffer[i].right <= r) {
            buffer[i].add += add;
            buffer[i].sum += (buffer[i].right - buffer[i].left + 1) * add;
            return;
        }

        int leftChild = leftChild(i);
        int rightChild = rightChild(i);

        pushDown(i);

        update(l, r, add, leftChild);
        update(l, r, add, rightChild);
        buffer[i].sum = buffer[leftChild].sum + buffer[rightChild].sum;
    }

    public long query(int l, int r, int i) {
        if (buffer[i].right < l || buffer[i].left > r) return 0;

        if (buffer[i].left >= l && buffer[i].right <= r) {
            return buffer[i].sum;
        }

        int leftChild = leftChild(i);
        int rightChild = rightChild(i);

        pushDown(i);

        return query(l, r, leftChild) + query(l, r, rightChild);
    }

    private void pushDown(int i) {
        int leftChild = leftChild(i);
        int rightChild = rightChild(i);

        if (leftChild == rightChild) {
            buffer[i].add = 0;
            return;
        }

        if (buffer[i].add != 0) {
            buffer[leftChild].sum += (buffer[leftChild].right - buffer[leftChild].left + 1)
                                     * buffer[i].add;
            buffer[leftChild].add += buffer[i].add;

            buffer[rightChild].sum += (buffer[rightChild].right - buffer[rightChild].left + 1)
                                      * buffer[i].add;
            buffer[rightChild].add += buffer[i].add;

            buffer[i].add = 0;
        }
    }
}
