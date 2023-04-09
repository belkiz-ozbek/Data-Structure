package HW2;

//foreach kullan teker teker kontrol et, sayılar doğru diziliyor mu?
import java.util.Arrays;
//countingSort'ta loop kullandık ama big O n^2 değil O(n + k) whyy? 

/**
 *
 * @author belkizozbek
 */
public class Sorting {

    // Generate integer arrays of size 1000, 10000, 50000, and 100000, where each element is randomly selected between 0 and 106.
    public static void main(String[] args) {

        Sorting sort = new Sorting();

        int[] array1 = new int[1000];
        int[] array2 = new int[10_000];
        int[] array3 = new int[50_000];
        int[] array4 = new int[100_000];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = sort.randomNumber();
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = sort.randomNumber();
        }

        for (int i = 0; i < array3.length; i++) {
            array3[i] = sort.randomNumber();
        }

        for (int i = 0; i < array4.length; i++) {
            array4[i] = sort.randomNumber();
        }

        //for same input
        //for array1
        int[] temp1 = new int[1_000];   
        int[] temp2 = new int[1_000];
        int[] temp3 = new int[1_000];
        int[] temp4 = new int[1_000];
        temp1 = Arrays.copyOf(array1, array1.length);
        temp2 = Arrays.copyOf(array1, array1.length);
        temp3 = Arrays.copyOf(array1, array1.length);
        temp4 = Arrays.copyOf(array1, array1.length);

        sort.selectionSort(array1);
        sort.bubbleSort(temp1);

        long start = System.currentTimeMillis();
        sort.mergeSort(temp2, 0, temp2.length - 1, 0);
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("Time for merge: " + time);

        sort.quickSort(temp3, 0, array1.length - 1);   //array, array ilk indeks, array son indeks
        sort.countingSort(temp4);
        /*
        //merge sort yazdır.
        int[] sortedArray = sort.mergeSort(array1, 0, array1.length - 1);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }*/
        //for array2
        int[] temp1_2 = new int[10_000];
        int[] temp2_2 = new int[10_000];
        int[] temp3_2 = new int[10_000];
        int[] temp4_2 = new int[10_000];
        temp1_2 = Arrays.copyOf(array2, array2.length);
        temp2_2 = Arrays.copyOf(array2, array2.length);
        temp3_2 = Arrays.copyOf(array2, array2.length);
        temp4_2 = Arrays.copyOf(array2, array2.length);

        System.out.println();
        sort.selectionSort(array2);
        sort.bubbleSort(temp1_2);

        start = System.currentTimeMillis();
        sort.mergeSort(temp2_2, 0, temp2_2.length - 1, 0);
        finish = System.currentTimeMillis();
        time = finish - start;
        System.out.println("Time for merge: " + time);

        sort.quickSort(temp3_2, 0, array2.length - 1);
        sort.countingSort(temp4_2);

        //for array3
        int[] temp1_3 = new int[50_000];
        int[] temp2_3 = new int[50_000];
        int[] temp3_3 = new int[50_000];
        int[] temp4_3 = new int[50_000];
        temp1_3 = Arrays.copyOf(array3, array3.length);
        temp2_3 = Arrays.copyOf(array3, array3.length);
        temp3_3 = Arrays.copyOf(array3, array3.length);
        temp4_3 = Arrays.copyOf(array3, array3.length);

        System.out.println();
        sort.selectionSort(array3);
        sort.bubbleSort(temp1_3);

        start = System.currentTimeMillis();
        sort.mergeSort(temp2_3, 0, temp2_3.length - 1, 0);
        finish = System.currentTimeMillis();
        time = finish - start;
        System.out.println("Time for merge: " + time);

        sort.quickSort(temp3_3, 0, array3.length - 1);
        sort.countingSort(temp4_3);

        //for array4
        int[] temp1_4 = new int[100_000];
        int[] temp2_4 = new int[100_000];
        int[] temp3_4 = new int[100_000];
        int[] temp4_4 = new int[100_000];
        temp1_4 = Arrays.copyOf(array4, array4.length);
        temp2_4 = Arrays.copyOf(array4, array4.length);
        temp3_4 = Arrays.copyOf(array4, array4.length);
        temp4_4 = Arrays.copyOf(array4, array4.length);

        System.out.println();
        sort.selectionSort(array4);
        sort.bubbleSort(temp1_4);

        start = System.currentTimeMillis();
        sort.mergeSort(temp2_4, 0, temp2_4.length - 1, 0);
        finish = System.currentTimeMillis();
        time = finish - start;
        System.out.println("Time for merge: " + time);

        sort.quickSort(temp3_4, 0, array4.length - 1);
        sort.countingSort(temp4_4);

    }

    public void selectionSort(int[] array) {

        long start = System.currentTimeMillis();
        int comparisons = 0;
        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                comparisons++;
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            if (min != j) {
                swap(array, j, min);
            }
        }

        /*for (int num : array) {
            System.out.println(num);
        }*/
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println(array.length);
        System.out.println("Time for selection: " + time + " ms.");
        System.out.println("number of comparisons for selection: " + comparisons);

    }

    public void bubbleSort(int[] array) {

        long start = System.currentTimeMillis();
        int comparisons = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                comparisons++;
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }

        /*for (int num : array) {
            System.out.println(num);
        }*/
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("Time for bubble: " + time + " ms.");
        System.out.println("numebr of comparisons for bubble: " + comparisons);

    }

    //İki alt dizi elemanlarını karşılaştır ve küçük olanı önce yeni diziye ekle
    //Bir alt dizi bittiğinde, diğer alt diziye kalan elemanları sırasıyla yeni diziye ekle.
    public int[] mergeSort(int[] array, int leftIndex, int rightIndex, int comparisons) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, middleIndex, comparisons);
            mergeSort(array, middleIndex + 1, rightIndex, comparisons);
            merge(array, leftIndex, middleIndex, rightIndex, comparisons);
        }
        return array;
    }

    public void merge(int[] array, int sol, int orta, int sag, int comparisons) {
        int solArraySize = orta - sol + 1;
        int sagArraySize = sag - orta;

        int[] leftArray = new int[solArraySize];
        int[] rightArray = new int[sagArraySize];

        for (int i = 0; i < solArraySize; i++) {
            leftArray[i] = array[sol + i];
        }

        for (int j = 0; j < sagArraySize; j++) {
            rightArray[j] = array[orta + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = sol;

        while (i < solArraySize && j < sagArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
            comparisons++;
        }

        while (i < solArraySize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < sagArraySize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
        if (sol == 0 && sag == array.length - 1) {
            System.out.println("Number of comparisons for merge: " + comparisons);
        }
    }

    public void quickSort(int[] array, int low, int high) {
        long start = System.currentTimeMillis();
        int comparisons = 0;
        if (low < high) {
            int pivotIndex = partition(array, low, high, comparisons);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
            comparisons += pivotIndex - low + high - pivotIndex;
        }
        if (low == 0 && high == array.length - 1) {
            long finish = System.currentTimeMillis();
            long time = finish - start;
            System.out.println("Time for quick: " + time + " ms.");
            /*for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }*/

            System.out.println("Number of comparisons for quick: " + comparisons);
        }
    }

    public int partition(int[] array, int low, int high, int comparisons) {
        int pivot = array[(low + high) / 2];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
                comparisons++;
            } while (array[i] < pivot);
            do {
                j--;
                comparisons++;
            } while (array[j] > pivot);
            if (i >= j) {
                return j;
            }
            swap(array, i, j);
        }
    }

    public void countingSort(int[] array) {
        long start = System.currentTimeMillis();
        int comparisons = 0;
        //array'deki en büyük elemanı bul.
        int max = array[0];
        int size = array.length;

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            comparisons++;
        }

        int[] b = new int[max + 1]; //array'de max elemanın bir fazlası size'ı belirler.
        int bSize = b.length;

        //b arrayinin ilk hali
        Arrays.fill(b, 0);

        //arraydaki değerleri indis karşılığına gelen elemana ata.
        int num;
        for (int i = 0; i < size; i++) {
            num = array[i];
            b[num]++;
        }

        int k = 0;
        for (int i = 0; i < bSize; i++) {
            for (int j = 0; j < b[i]; j++) {
                array[k++] = i;
            }
            comparisons++;
        }

        /*for (int numbers : array) {
            System.out.println(numbers);
        }*/
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("Time for counting: " + time + " ms.");
        System.out.println("Number of comparisons for counting: " + comparisons);
    }

    public void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int randomNumber() {
        return (int) (Math.random() * Math.pow(10, 6));
    }

}
