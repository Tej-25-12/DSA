package array;

import java.util.Scanner;

public class matrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.println("Enter number of rows: ");
        rows =sc.nextInt();
        System.out.println("Enter number of Columns: ");
        cols =sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];
        System.out.println("Enter matrix elements: ");
        for(int i=0; i< rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Original Matrix: ");
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for(int i=0; i<cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
