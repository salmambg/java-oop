package string_package;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Salma Akter";
        String s2 = new String("Salma Akter");

        char[] s3 = {'s','a','l','m','a'};
        System.out.println(s3);

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        int len = s1.length();
        System.out.println("Length of s1 = "+ len);

        if(s1.equals(s2)) {
            System.out.println("Equals");
        }else{
            System.out.println("not equals");
        }
        boolean con = s1.contains(" sal");
        System.out.println(con);

        boolean b =s1.isEmpty();
        System.out.println("b = "+b);
    }
}
