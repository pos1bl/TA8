public class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }

    public int getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}

