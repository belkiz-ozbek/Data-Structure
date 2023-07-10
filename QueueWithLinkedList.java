package queue;

public class QueueWithLinkedList {

    Node rear;
    Node front;
    int size;
    int counter;

    public QueueWithLinkedList(int size) {
        this.size = size;
        rear = null;
        front = null;
        counter = 0;
    }

    void enqueue(int data) {

        if (isFull()) {
            System.out.println("List is full, we can not adding");
        } else {
            Node node = new Node(data);
            if (front == null) {
                front = node;
                rear = node;
            } else {
                rear.next = node;
                rear = rear.next;
            }
            counter++;
        } 
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("List is empty, we can not emptying");
        } else {
            Node temp = front;
            front = front.next;
            temp = null;
            counter--;
        }
    }

    boolean isFull() {
        if (counter == size) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    void print() {
        Node temp = front;
        for (int i = 0; i < counter; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
