package array_demo;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        double[] number = new double[5];
        double sum = 0;
        System.out.print("please enter 5 numbers : ");

        for(int i = 0; i< 5; i++) {
            number[i] = input.nextDouble();
        }
        for(int i =0; i<5; i++) {
            sum = sum + number[i];
        }
        System.out.println("The sum is = "+ sum);

        double avg = sum/5;
        System.out.println("The average is : "+ avg);

        double max = number[0];
        double min = number[0];
        for(int i =1; i<5; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if(min>number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum = "+ max);
        System.out.println("Minimum = " + min);
    }
}
