package string_package;

public class StringDemo5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Salma");
        System.out.println(sb);

        sb.append("Akter");
        sb.append(25);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);

        sb.setLength(4);
        System.out.println(sb);



    }
}
