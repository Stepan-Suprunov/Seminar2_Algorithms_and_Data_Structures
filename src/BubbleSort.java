// Пузырьковая сорторовка
public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
        return array;
    }
}


//        for (int i = 0; i < array.length - 1; i++) {
//            boolean sorted = true;
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    sorted = false;
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//            if (sorted) break;
//        }
//        return array;
//    }
//}
