package array_demo;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println("ArrayList contains : "+ number);
        System.out.println();
        System.out.println("size = "+number.size());

        boolean check = number.isEmpty();
        System.out.println("ArrayList empty : "+check);

        boolean contain = number.contains(40);
        System.out.println("40 is in the list : "+ contain);

        int in = number.indexOf(30);
        System.out.println("The index of 30 is : " +in);

        number.set(3,50);//replace
        System.out.println("after setting : "+number);

        int x = number.get(1);
        System.out.println("Index 1: "+x);
    }
}
