package stackwithlinkedlist;

public class StackWithLinkedList {

    int size;
    int cnt;
    Node top; //head

    public StackWithLinkedList(int size) {
        this.size = size;
        top = null;
        cnt = 0;
    }

    void push(int data) {

        Node node = new Node(data);
        if (isFull()) {
            System.out.println("Ekleme yapılamadı stack dolu!!");
        } else {
            if (top == null) {
                top = node;
            } else {
                node.next = top;
                top = node;
            }

            cnt++;
        }

    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Çıkarma işlemi yapılamaz. Stack boş!!");
        } else {
            Node temp = top;
            top = top.next; //bu yeterli
            temp = null;
            cnt--;
        }
    }

    boolean isEmpty() {
        if (cnt == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (cnt == size) {
            return true;
        } else {
            return false;
        }
    }

    void print() {
        Node temp = top;
        for(int i = 0; i < cnt; i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }

}
