package RailworldJavaBasics;

public class OppDiagonal {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printOppositeDiagonal(array);
    }

    public static void printOppositeDiagonal(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    for (int k = 0; k < j; k++) {
                        System.out.print("   ");
                    }
                    System.out.println(array[i][j]);
                }
            }
        }
    }

}
