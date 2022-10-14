package java_1014;

import java.util.Arrays;

public class InsertionSort {
//    static int[] arr = {8, 5, 6, 2, 4};

    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int j = i - 1;

            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;
        }

        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        swap(arr, 0, 1);
//        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
