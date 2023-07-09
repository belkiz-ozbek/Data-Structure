package doublylinkedlist;

public class DoublyLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    void insertHead(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;

            head = node;
            head.prev = null;
        }
        size++;

    }

    void insertTail(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    void insertMiddle(int data, int indis) {

        Node temp = head;
        Node temp2 = null;
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else if (head != null && indis == 0) {
            head.prev = node;
            node.next = head;
            head = node;
        } else {

            for (int i = 0; i < indis - 1; i++) {
                temp2 = temp;
                temp = temp.next;
            }

            if (temp.next == null) {
                temp.next = node;
                node.prev = temp;
                tail = node;
            } else {
                temp2.next = node;
                node.prev = temp2;

                node.next = temp;
                temp.prev = node;
            }

        }

        size++;

    }

    void print() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    void printFromTheEnd() {

        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }

    }

}
