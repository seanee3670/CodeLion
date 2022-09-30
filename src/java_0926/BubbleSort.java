package java_0926;

public class BubbleSort {

    static int[] bubbleSort(int n, int[] arr) {

        // n - 1까지
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 1, 3};

        bubbleSort(arr.length, arr);

        for (int e : arr) {
            System.out.println("e = " + e);
        }

    }
}
