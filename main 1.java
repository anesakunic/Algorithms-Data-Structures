public class main {
    public static void main(String[] args) {
        char[] characters = {'k', 'a', 'o', 'l', 'f', 'z', 'd'};
        KunicQuickSort quickSort = new KunicQuickSort(characters);
        quickSort.sort();
        for (char c : characters) {
            System.out.print(c + " ");
        }
    }
}
