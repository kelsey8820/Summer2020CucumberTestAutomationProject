package OfficeHours.MethodsRecap;

public class Palindrome {
    public static void main(String[] args) {

        String name = "Level";
        //             01234
        String reversedName="";
        for(int i = name.length()-1; i>=0; i--){
            reversedName += name.charAt(i);
            // System.out.print(name.charAt(i));
        }

        System.out.println(name.equalsIgnoreCase(reversedName));

        String word = "Elmira";

        String reversedWord = "";
        for(int i = word.length()-1; i>=0; i--){
            reversedWord += word.charAt(i);
        }
        System.out.println(word.equalsIgnoreCase(reversedWord));
    }
}
