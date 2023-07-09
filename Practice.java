package doublylinkedlist;


public class Practice {
    
    public static void main(String[] args) {
        
        DoublyLinkedList db = new DoublyLinkedList();
        
        db.insertHead(12);
        db.insertTail(17);
        db.insertHead(34);
        db.insertMiddle(33, 3);
        db.print();
        System.out.println("*******");
        //db.printFromTheEnd();
        
        
        
    }
    
}
