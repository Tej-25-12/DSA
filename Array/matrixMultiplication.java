package array;

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.print("Enter number of rows and columns of first matrix: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.print("enter number of rows and columns of second matrix: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if( c1 != r2 ) {
            System.out.println("Matrix Multiplication is not possible! ");
            return;
        }

        int[][] A =new int[r1][c1];
        int[][] B =new int[r2][c2];
        int[][] C =new int[r1][c2];

        System.out.println("Enter the elements of First Matrix: ");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of Second Matrix: ");
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r1; i++) {
            for(int j=0; j< c2; j++) {
                C[i][j]=0;
                for(int k=0; k<c1; k++) {
                    C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
                }
            }
        }

        System.out.println("Resultant Matrix: ");
        for(int i=0; i< r1; i++) {
            for (int j=0; j<c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
