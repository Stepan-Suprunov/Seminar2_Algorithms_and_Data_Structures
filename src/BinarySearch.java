// Бинарный поиск
public class BinarySearch {
    public static int binarySearch(int[] array, int target, int firstIndex, int lastIndex) {
        int middle;
        if (lastIndex < firstIndex) return -1;
        else {
            middle = (lastIndex - firstIndex) / 2 + firstIndex;
        }
        if (target > array[middle]) {
            return binarySearch(array, target, middle + 1, lastIndex);
        } else if (target < array[middle]) {
            return binarySearch(array, target, firstIndex, middle - 1);
        } else return middle;
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }
}
