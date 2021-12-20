package day18;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        Node root = new Node(20);
        addValue(root, 23);
        addValue(root, 22);
        addValue(root, 27);
        addValue(root, 24);
        addValue(root, 150);

        addValue(root, 14);
        addValue(root, 11);
        addValue(root, 5);
        addValue(root, 8);
        addValue(root, 15);
        addValue(root, 18);

        int[] res = dfs(root);
        Arrays.sort(res, 0, res.length);
        for (int i : res)
            System.out.println(i);
    }

    public static int[] dfs(Node root) {
        int[] test_ints = new int[0];
        int pos = getV(test_ints, 0, root, false);
        int[] currentInts = new int[pos];
        getV(currentInts, 0, root, true);
        return currentInts;
    }

    private static int getV(int[] ints, int pos, Node node, boolean setInts) {
        if(setInts)
            ints[pos] = node.getValue();
        pos += 1;
        Node leftNode = node.getLeftNode();
        if (leftNode != null) {
            pos = getV(ints, pos, leftNode, setInts);
        }
        Node rightNode = node.getRightNode();
        if (rightNode != null) {
            pos = getV(ints, pos, rightNode, setInts);
        }
        return pos;
    }

    public static void addValue(Node node, int value) {
        if (node.getValue() >= value) {
            Node leftNode = node.getLeftNode();
            addLeftChild(node, leftNode, value);
        } else {
            Node rightNode = node.getRightNode();
            addRightChild(node, rightNode, value);
        }
    }

    private static void addLeftChild(Node father, Node childNode, int value) {
        if (childNode == null) {
            father.setLeftNode(new Node(value));
        } else {
            addValue(childNode, value);
        }
    }

    private static void addRightChild(Node father, Node childNode, int value) {
        if (childNode == null) {
            father.setRightNode(new Node(value));
        } else {
            addValue(childNode, value);
        }
    }
}