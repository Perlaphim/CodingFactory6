package gr.aueb.cf.ch6.prct6A;

public class ArrayUnsizedInitialApp {

    public static void main(String[] args) {
        int[][] grid = {{1,2},{3,4},{5,6}};

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
