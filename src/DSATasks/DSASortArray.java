package RailworldJavaBasics.ObjectCollaboration.DSATasks;

import java.util.Arrays;

public class DSASortArray {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 2, 2, 1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int i = 0;

        while (i <= right) {
            if (arr[i] == 0) {
                swap(arr, i, left);
                left++;
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, right);
                right--;
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
