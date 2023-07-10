package Tree;

public class BinaryTree {

    Node root = null;

    void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            insert(root, data);
        }
    }

    void insert(Node node, int data) {
        if (node.data < data) {
            if (node.left == null) {
                node.left = new Node(data);

            } else {
                insert(node.left, data);
            }
        } else {

            if (node.right == null) {
                node.right = new Node(data);

            } else {
                insert(node.right, data);
            }
        }

    }

}
