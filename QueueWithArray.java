package queue;

// FIFO => ilk giren ilk çıkar
public class QueueWithArray {

    int[] dizi;
    int front;  //baştaki eleman
    int rear;   //sondaki eleman

    int size;

    public QueueWithArray(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }

    //eleman ekleme
    void enqueu(int data) {

        if (isFull()) {
            System.out.println("Array is full, we can not queue!!");
        } else {
            rear++;
            dizi[rear] = data;
        }

    }

    //eleman çıkartma
    void dequeu() {
        if (isEmpty()) {
            System.out.println("Array is empty, we can not dequeu");
        } else {
            for (int i = 0; i < rear; i++) {
                dizi[i] = dizi[i + 1];
            }
            rear--;
        }
        
    }

    boolean isFull() {
        if (rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (rear == -1) {
            return true;
        } else {
            return false;
        }
    }
   

    void print() {
        for(int i = 0; i < rear + 1; i++){
            System.out.println("[" + i + "]" + " = " + dizi[i]);
        }
    }

}
