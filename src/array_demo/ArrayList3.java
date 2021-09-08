package array_demo;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("Number 1 = "+number1);

        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        System.out.println("Number 2 = "+number2);

        number3.addAll(number1);
        System.out.println("Number 3 = "+ number3);

        boolean result = number1.equals(number2);
        System.out.println("Number 1 == number 2 : "+ result);

        boolean res = number1.equals(number3);
        System.out.println("Number 1 == number 3 : "+ res);



    }
}
