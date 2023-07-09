package singlylinkedlist;


public class Uygulama {
 
    public static void main(String[] args) {
        
        SinglyLinkedList liste = new SinglyLinkedList();
        
        liste.insert(11);
        liste.insert(45);
        liste.insert(46);
        liste.InsertHead(43);
        liste.InsertTail(0);
        liste.InsertMiddle(3, 990);
        liste.deleteFromMiddle(2);
        
        /*liste.deleteTail();
        liste.deleteTail();
        liste.deleteTail();
        liste.deleteTail();
        liste.deleteTail();
        liste.deleteTail();
        liste.deleteTail();
        liste.deleteHead();
        liste.deleteHead();
        liste.deleteHead();
        liste.deleteHead();
        liste.deleteHead();
        liste.deleteHead();
        liste.deleteHead();
        liste.deleteHead();
        liste.deleteHead();*/
        
        liste.print();
    }
     
}
