package OfficeHours.MethodsRecap;

public class Palindrome2 {

    public static void main(String[] args) {
        String str = "kayak";
        System.out.println( str.equalsIgnoreCase( reversedStr(str)));

        System.out.println( isPalindrome("Fatih"));
        System.out.println( isPalindrome("Anna"));

        boolean result = isPalindrome("Muhtar");
    }

    public static String reversedStr(String str){
        String reversedStr = "";
        for(int i = str.length()-1; i>=0; i--){
            reversedStr += str.charAt(i);
        }

        return reversedStr;

    }

    public static boolean isPalindrome(String str){
        return str.equalsIgnoreCase( reversedStr(str) );
    }

}
