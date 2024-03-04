public class main {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4, 15, 8};

        System.out.print("Input Array: ");
        KunicMergeSort.printArray(arr);

        KunicMergeSort.mergeSort(arr, 0, arr.length - 1);

        System.out.print("Output: ");
        KunicMergeSort.printEvenOddSeparated(arr);
    }
}
