package doublylinkedlist;


public class Node {
    
    Node next;
    Node prev;
    int data;

    public Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
    
}
