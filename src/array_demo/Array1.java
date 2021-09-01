package array_demo;

public class Array1 {
    public static void main(String[] args) {
        int[] number= new int [6];

        number[0] = 13;
        number[1] = 14;
        number[2] = 15;
        number[3] = 16;
        number[4] = 17;
        number[5] = 18;

        int sum = number[0] + number[1] +number[2] +number[3] +number[4] +number[5];
        System.out.println("sum = "+sum);

        int len = number.length;
        System.out.println("Array size = "+len);

        System.out.println(number[3]);


    }
}
