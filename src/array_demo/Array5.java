package array_demo;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        System.out.println("enter element for A matrix : ");

        for (int row =0; row< 2; row++) {
            for(int col =0; col< 3; col++) {
                A[row][col] = input.nextInt();
            }
        }
        System.out.println("Enter element for B matrix : ");

        for (int row =0; row< 2; row++) {
            for(int col =0; col< 3; col++) {
                B[row][col] = input.nextInt();
            }
        }


        System.out.println("A = ");
        for(int row= 0; row <2; row++) {
            for(int col= 0; col<3; col++) {
                System.out.print(" \t "+ A[row][col]);
            }
            System.out.println();

        }


        System.out.println("B = ");
        for(int row= 0; row <2; row++) {
            for(int col= 0; col<3; col++) {
                System.out.print(" \t "+ B[row][col]);
            }
            System.out.println();

        }
        System.out.println("A+B = ");
        for(int row =0; row<2; row++ ) {
            for(int col=0; col<3; col++) {
                System.out.print("\t "+(A[row][col] + B[row][col]));
            }
            System.out.println();
        }

    }
}
