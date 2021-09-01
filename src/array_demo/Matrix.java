package array_demo;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A= new int[3][3];
        int sumofDiagonalElements = 0;
        int sumofUpperTriangleElements = 0;
        int sumofLowerTriangleElements = 0;
        for(int row= 0; row<3; row++) {
            for( int col = 0;col<3;col++) {
                A[row][col] = input.nextInt();
            }
        }
        for(int row= 0; row<3;row++) {
            for(int col=0; col<3; col++) {
                if(row==col) {
                    sumofDiagonalElements = sumofDiagonalElements + A[row][col];
                }
                if(row<col) {
                    sumofUpperTriangleElements = sumofUpperTriangleElements + A[row][col];
                }
                if(row>col) {
                    sumofLowerTriangleElements = sumofLowerTriangleElements + A[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal elements: "+ sumofDiagonalElements);
        System.out.println("Sum of upper triangle elements: "+ sumofUpperTriangleElements);
        System.out.println("Sum of lower triangle elements: "+ sumofLowerTriangleElements);

    }
}
