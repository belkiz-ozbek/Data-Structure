package singlylinkedlist;

public class SinglyLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    //liste yapısına düğüm değeri ekle
    void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
            System.out.println("Liste olusturuldu, ilk dugum eklendi!  ");
        } else {
            //sona ekleme yapıyoruz
            tail.next = node;
            tail = node;
            System.out.println("Listenin sonuna eleman eklendi!");
        }

        size++;

    }

    void print() {

        if (head == null) {
            System.out.println("Liste bos!!!");
        } else {

            Node temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }

    }

    void InsertHead(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            node.next = null;
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;

    }

    void InsertTail(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            node.next = null;
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    void InsertMiddle(int indis, int data) {

        Node node = new Node();
        node.data = data;

        if (head == null && indis == 0) {
            node.next = null;
            head = node;
            tail = node;
        } else if (head != null && indis == 0) {
            node.next = head;
            head = node;

        } else {

            Node temp = head;
            Node temp2;

            for (int i = 0; i < indis - 1; i++) {
                temp = temp.next;
            }

            temp2 = temp.next;
            temp.next = node;
            node.next = temp2;

        }
        size++;
    }

    void deleteHead() {
        if (head == null) {
            System.out.println("Silinecek eleman yok!");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listedeki tek eleman silindi!");
        } else {
            head = head.next;
            System.out.println("Bastaki eleman silindi!");
        }
        
        size--;

    }

    void deleteTail() {
        if (head == null) {
            System.out.println("Silinecek eleman yok!");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listedeki tek eleman silindi");
        } else {

            Node temp = head;
            Node temp2 = null;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }

            /*
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            temp.next = null;
             */
            temp2.next = null;
            size--;
            System.out.println("Listenin sonundan eleman silindi!");
        }
    }

    // aradan eleman silmek
    void deleteFromMiddle(int indis) {

        if (head == null) {
            System.out.println("Silinecek eleman yok, liste boş!!");
        } else if (head.next == null && indis == 0) {
            head = null;
            tail = null;
            System.out.println("Silinecek tek eleman silindi");
            size--;
        } else if (head.next != null && indis == 0) {
            head = head.next;
            System.out.println("Bastaki eleman silindi");
            size--;
        }else{
            Node temp = head;
            Node temp2 = null;
            
            for(int i = 0; i < indis; i++){
                temp2 = temp;
                temp= temp.next;
            }
            temp2.next = temp.next;
            
        }

    }

}
