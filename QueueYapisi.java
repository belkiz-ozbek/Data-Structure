package uygulama;

/**
 *
 * @author belkizozbek
 */
public class QueueYapisi {

    int[] dizi;
    int size;
    int front;  //dizinin ilk indisi
    int rear;   //dizinin son indisi

    //constructor
    public QueueYapisi(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println("Kuyrul dolu ekleme yapamazsınız!");
        } else {
            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear] + " kuyruğa eklendi!");
        }

    }

    void deQueue() {

        int sayi = dizi[front];
        if (isEmpty()) {
            System.out.println("Kuyruk boş. Eleman çıkartılamaz!");
        } else {
            for (int i = 1; i <= rear; i++) {
                dizi[i - 1] = dizi[i];
            }
            rear--;
            System.out.println(sayi + " kuyruktan çıkartıldı!");
        }

    }

    private boolean isFull() {
        if (rear + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isEmpty() {
        if (rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        //dizi elemanlarını yazdır
       
         for (int numbers : dizi) {
            System.out.print(numbers + " ");
        }
        
        System.out.println("");
        
        for(int i = rear; i >= 0; i--){
        System.out.print(dizi[i] +  " ");
    }

    }

}
