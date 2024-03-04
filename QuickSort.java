import java.util.Arrays;

public class KunicQuickSort {
    private char[] array;
    public KunicQuickSort(char[] array) {
        this.array = array;
    }

    public void sort() {
        quickSort(0, array.length - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int partitionI = partition(low, high);
            quickSort(low, partitionI - 1);
            quickSort(partitionI + 1, high);
        }
    }
    private int partition(int low, int high) {
        int pivotIndex = calculatePivotI(low, high);
        char pivot = array[pivotIndex];
        swap(pivotIndex, high);

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

private int calculatePivotI(int low, int high) {
    int sum = 0;
    for (int i = low; i <= high; i++) {
        sum += (int) array[i];
    }

    int arrayLength = high - low + 1;
    int pivotI = (int) Math.floor((double) sum / arrayLength) + low;
    pivotI = Math.max(low, Math.min(high, pivotI)); 
    return pivotI;
}


    private void swap(int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
