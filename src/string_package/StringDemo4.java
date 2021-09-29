package string_package;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "This is my country";

        String s2 = s1.replace('i','k');
        System.out.println(s2);

        String[] s3 = s1.split("y");
        for(String x : s3) {
            System.out.println(x);
        }

    }
}
