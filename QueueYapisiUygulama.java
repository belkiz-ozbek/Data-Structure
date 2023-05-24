package uygulama;

public class QueueYapisiUygulama {

    public static void main(String[] args) {
        
        QueueYapisi q1 = new QueueYapisi(5);
        
        q1.enQueue(12);
        q1.deQueue();
        q1.enQueue(15);
        q1.enQueue(56);
        q1.enQueue(45);
        q1.deQueue();
        q1.enQueue(1);
        
        q1.show();
        System.out.println("");
        System.out.println(q1.dizi[q1.front]);
        System.out.println(q1.dizi[q1.rear]);
        
    }
    
}
