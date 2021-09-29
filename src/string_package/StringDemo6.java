package string_package;

public class StringDemo6 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Salma");
        System.out.println(str);

        str.append("Akter");
        str.delete(3,5);
        System.out.println(str);
    }
}
