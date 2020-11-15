package day10_IfStatements;

import com.sun.deploy.security.SelectableSecurityManager;

public class If_WithoutCurlyBraces {
    public static void main(String[] args) {
        if(9>10) {
            System.out.println("Hello");
            System.out.println("How are you");
        }

        // No curly braces
        if( 9> 10)
            System.out.println("Hello");
            System.out.println("How are you");
            // it is always better to use the curly braces!
        // CAN ONLY CONTAIN ONE SINGLE LINE OF CODE!!


        int num = 100;
        if(num%2 == 0)
        System.out.println("Even Number");
        else
        System.out.println("Odd Number");
        //WILL NOT BE USING "WITHOUT CURLY BRACKETS"
    }

}
