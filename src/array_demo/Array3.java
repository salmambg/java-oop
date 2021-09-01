package array_demo;

public class Array3 {
    public static void main(String[] args) {
        String[] names = {"Salma","Nazmul", "Hossain","Akter" };

        for(String x : names) {
            System.out.println(x);
        }
        int[] num = {10,23,2,5,6,8};
        int sum =0;
        for(int x : num) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
