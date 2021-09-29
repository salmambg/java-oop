package string_package;

public class StringDemo3 {
    public static void main(String[] args) {
        String country = "Bangladesh is my country";
        System.out.println(country);

        char ch =country.charAt(3);
        System.out.println("ch "+ch);

        int value= country.codePointAt(2);
        System.out.println("value = "+value);

        int pos= country.indexOf('h');
        System.out.println("first position of h = "+pos);

        pos= country.lastIndexOf('n');
        System.out.println("last position of n = "+pos);

    }
}
