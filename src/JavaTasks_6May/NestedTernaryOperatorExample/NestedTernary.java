package JavaTasks_6May.NestedTernaryOperatorExample;

public class NestedTernary {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxRange(arr, 1, 3));
    }

    static int maxRange(int[] arr, int start, int end) {
        return (arr == null || start > end) ? -1 :
                (start == end) ? arr[start] :
                        arr[start] > maxRange(arr, start + 1, end) ? arr[start] : maxRange(arr, start + 1, end);
    }

    static int max(int[] arr) {
        return arr.length == 0 ? -1 :
                arr.length == 1 ? arr[0] :
                        arr[0] > max(copyOfRange(arr, 1, arr.length)) ? arr[0] : max(copyOfRange(arr, 1, arr.length));
    }

    static int[] copyOfRange(int[] original, int from, int to) {
        int newLength = to - from;
        int[] copy = new int[newLength];
        System.arraycopy(original, from, copy, 0, Math.min(original.length - from, newLength));
        return copy;
    }
}
