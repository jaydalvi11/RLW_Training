package RailworldJavaBasics.ObjectCollaboration.DSATasks;

public class PeakElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        System.out.println("Peak element in array : " + getPeak(arr));
    }

    public static int getPeak(int[] arr) {
        int n = arr.length;

        if (arr[0] >= arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return arr[n - 1];
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }

}
