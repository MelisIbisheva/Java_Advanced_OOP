package MultidimensionalArrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = compareMatrices(firstMatrix,secondMatrix);
        if(areEqual){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }


    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if(firstMatrix.length!=secondMatrix.length){
            return false;
        }
        for (int row = 0; row <firstMatrix.length ; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];
            if(firstArr.length!=secondArr.length){
                return false;
            }
            for (int col= 0; col < firstArr.length; col++) {
                int firstElement = firstArr[col];
                int secondElement = secondArr[col];

                if(firstElement!=secondElement){
                    return false;
                }

            }

        }
        return true;
    }

    private  static int[][] readMatrix(Scanner scanner){
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {


            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[row] = arr;
        }
        return matrix;

    }
}
