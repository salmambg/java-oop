package array_demo;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int[] number = {21,4,5,10,-2};
        Arrays.sort(number);

        System.out.print("Ascending : ");
        for(int i=0;i< 5; i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println();

        System.out.print("Descending : ");
        for(int i=4;i>=0;i--) {
            System.out.print(" "+number[i]);
        }
        System.out.println();

        String[] names={"Salma","Nazmul","Akter","gm"};
        Arrays.sort(names);
        for (int i=0;i<4;i++) {
            System.out.print(names[i]+ " ");
        }
        System.out.println();
        for (int i= 3;i>=0;i--) {
            System.out.print(names[i]+" ");
        }

    }
}
