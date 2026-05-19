import java.util.Arrays;
import java.util.Comparator;

public class SimpleSortDriver {
    public static void main(String[] args) {
        Comparator<Integer> comp = Comparator.naturalOrder();

        Integer[] arr1 = {5, 1, 9, 3, 7, 6};
        Integer[] arr2 = {9, 7, 6, 5, 3, 1};
        Integer[] arr3 = {1, 3, 5, 6, 7, 9};

        testArray("Test 1: Unsorted Array", arr1, comp);
        testArray("Test 2: Reverse-Sorted Array", arr2, comp);
        testArray("Test 3: Already-Sorted Array", arr3, comp);
    }

    private static void testArray(String title, Integer[] arr, Comparator<Integer> comp) {
        Integer[] bubbleCopy = Arrays.copyOf(arr, arr.length);
        Integer[] insertionCopy = Arrays.copyOf(arr, arr.length);

        System.out.println("--- " + title + " ---");
        System.out.println("Original: " + Arrays.toString(arr));

        SimpleSorters.bubbleSort(bubbleCopy, comp);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleCopy));

        SimpleSorters.insertionSort(insertionCopy, comp);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionCopy));
        System.out.println();
    }
}
