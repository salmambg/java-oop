package string_package;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {
        String firstName ="Salma";
        String lastName  =" Akter";

        String fullName = firstName. concat(lastName);
        System.out.println("Full Name = "+fullName);

        String upperName = fullName. toUpperCase();
        System.out.println("upperName = "+ upperName);

        String lowerName = fullName. toLowerCase();
        System.out.println("lowerName = "+ lowerName);

        boolean b = firstName.startsWith("S");
        System.out.println("b = "+b);

        boolean last = lastName.endsWith("r");
        System.out.println("last ="+last);

        String[] names = {"samiha","sabiha","jamil"};
        for(int i =0; i<3;i++) {
            System.out.println(names[i]);
        }

    }
}
