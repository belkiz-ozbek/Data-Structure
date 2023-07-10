package tree;

public class TraversingBinaryTree {

    Node root = null;

    void ekle(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            ekle(root, data);
        }
    }

    void ekle(Node node, int data) {
        if (node.data > data) {
            //solunu yazdır
            if (node.left == null) {
                node.left = new Node(data);
            } else {
                ekle(node.left, data);
            }
        } else {
            //sağına yazdır
            if (node.right == null) {
                node.right = new Node(data);
            } else {
                ekle(node.right, data);
            }
        }
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

}
