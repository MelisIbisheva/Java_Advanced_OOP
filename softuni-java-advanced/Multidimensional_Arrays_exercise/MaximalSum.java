package MultidimensionalArrays_exc;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        int maxSum = Integer.MIN_VALUE;
        int bestStartingRow = -1;
        int bestStartCol = -1;

        for (int row = 0; row < rows-2; row++) {
            for (int col = 0; col < cols-2; col++) {
                int sum = matrix[row][col] + matrix[row][col+1] + matrix[row][col+2]
                        +matrix[row+1][col] + matrix[row+1][col+1] + matrix[row+1][col+2]
                        +matrix[row+2][col] + matrix[row+2][col+1] + matrix[row+2][col+2];

                if(sum>maxSum){
                    maxSum = sum;
                    bestStartingRow = row;
                    bestStartCol = col;
                }

            }

        }
        System.out.printf("Sum = %d" + System.lineSeparator(),maxSum);
        for (int row = bestStartingRow; row <bestStartingRow +3 ; row++) {
            for (int col = bestStartCol; col <bestStartCol+3 ; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }
    }
}
