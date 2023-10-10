import java.util.*;

public class Main {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 9, 7, 8, 5, 6, 3, 2, 1 }; // Example input in descending order
        bubbleSort(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(" " + arr[i]);
        }
    }
}
// for descending order; rrun it on online complier otherwise change classname.. thank you .
// skremo