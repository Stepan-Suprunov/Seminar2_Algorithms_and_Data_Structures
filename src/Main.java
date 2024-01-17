public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 9, 3, 7, 6, 2, 1, 4, 8, 0};
        int target = 3;
        ArrayPrinter.printArray(array);
        //BubbleSort.bubbleSort(array);
        //DirectSort.directSort(array);
        //InsertSort.insertSort(array);
        QuickSort.quickSort(array);
        ArrayPrinter.printArray(array);
        System.out.println(BinarySearch.binarySearch(array, target));
    }
}
