package RailworldJavaBasics;

public class DiagonalElements {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printElementsDiagonally(array);
    }

    public static void printElementsDiagonally(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    for (int k = 0; k < i; k++) {
                        System.out.print("    ");
                    }
                    System.out.println(array[i][j]);
                }
            }
        }
    }

}
