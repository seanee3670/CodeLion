package java_1013;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 3, 9, 28, 11 };

        for (int i = arr.length - 1; i > 0; i--) { // ~ loop 마다 어디 idx 까지 탐색할건가
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
