package Day1_JavaBasics;

public class SecondHighestElement {

    public static void main(String[] args) {
        int[] arry = {1,2,3,4,5,6,7,8,8,8,8};
        int secondHighest = getSecHighest(arry);
        System.out.println(secondHighest);
    }


    public static int getSecHighest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
