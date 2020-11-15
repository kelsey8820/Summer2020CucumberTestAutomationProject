package day12_Switch_Scanner;
/*
write a program that can ask user to enter a number
            if the number is odd number print: "odd number"
            otherwise, print: "Even"
 */


import java.util.Scanner;

public class User_Input_Prractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        double num1 = scan.nextDouble();

        String result = (num1%2 == 0) ? "Even":"Odd";
        System.out.println(result);
    }
}
