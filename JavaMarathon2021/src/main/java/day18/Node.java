package day18;

public class Node {
    private int value;
    private Node leftNode;
    private Node rightNode;

    public Node(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public Node(int value, Node leftNode, Node rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
