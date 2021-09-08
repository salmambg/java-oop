package array_demo;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        //System.out.println(number);
        for(int n : number){
            System.out.print(n+ " ");
        }
        System.out.println();
        System.out.println("size = "+number.size());

        number.remove(2);
        System.out.println("After removing ArrayList contains : "+number);

        number.removeAll(number);
        System.out.println(" After removing all :"+ number);

    }
}
