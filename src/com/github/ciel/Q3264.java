package com.github.ciel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 *
 */
public class Q3264 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String temp = reader.readLine();
        String[] buf = temp.split(" ");
        int n = Integer.parseInt(buf[0]);
        int q = Integer.parseInt(buf[1]);

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            temp = reader.readLine();
            nums[i] = Integer.parseInt(temp);
        }

        SegmentTree tree = new SegmentTree(nums);

        for (int i = 0; i < q; i++) {
            temp = reader.readLine();
            buf = temp.split(" ");
            int a = Integer.parseInt(buf[0]);
            int b = Integer.parseInt(buf[1]);
            System.out.println(tree.query(a, b));
        }
    }
}

class SegmentTree {

    private static class Node {

        public static final int MIN = 0;
        public static final int MAX = 1000001;

        public int left, right;
        public int min, max;

        public Node() {
            this(0, 0);
        }

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
            min = MAX;
            max = MIN;
        }
    }

    private int n;
    private Node[] buf;
    private int _min, _max;

    public SegmentTree(int[] nums) {
        this.n = nums.length;
        buf = new Node[n << 2];
        build(1, n, 1, nums);
    }

    private static int mid(int l, int r) {
        return (l + r) >> 1;
    }

    private static int leftChild(int node) {
        return node << 1;
    }

    private static int rightChild(int node) {
        return node << 1 | 1;
    }

    private void build(int l, int r, int node, int[] nums) {
        if (buf[node] == null) {
            buf[node] = new Node(l, r);
        }
        buf[node].left = l;
        buf[node].right = r;

        if (l == r) {
            buf[node].min = nums[l - 1];
            buf[node].max = nums[l - 1];
            return;
        }

        int mid = mid(l, r);
        int leftChild = leftChild(node);
        int rightChild = rightChild(node);
        build(l, mid, leftChild, nums);
        build(mid + 1, r, rightChild, nums);

        int min1 = buf[leftChild].min;
        int min2 = buf[rightChild].min;
        int max1 = buf[leftChild].max;
        int max2 = buf[rightChild].max;
        buf[node].min = min1 < min2 ? min1 : min2;
        buf[node].max = max1 > max2 ? max1 : max2;
    }

    public int query(int a, int b) {
        query(a, b, 1);
        return _max - _min;
    }

    private void query(int a, int b, int node) {
        if (a > buf[node].right || b < buf[node].left) {
            _min = Node.MAX;
            _max = Node.MIN;
            return;
        }

        if (a <= buf[node].left && b >= buf[node].right) {
            _min = buf[node].min;
            _max = buf[node].max;
            return;
        }

        int leftChild = leftChild(node);
        int rightChild = rightChild(node);

        query(a, b, leftChild);
        int min1 = _min;
        int max1 = _max;

        query(a, b, rightChild);
        int min2 = _min;
        int max2 = _max;

        _min = min1 < min2 ? min1 : min2;
        _max = max1 > max2 ? max1 : max2;
    }
}
