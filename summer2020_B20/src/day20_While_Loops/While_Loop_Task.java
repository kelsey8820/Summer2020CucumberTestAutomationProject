package day20_While_Loops;

import java.util.Scanner;

/*
Write a program that asks user to enter his/her username and password until user enters
correctly.
 */
public class While_Loop_Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("Enter your password");
        String input = scan.nextLine();

        if(!input.equals(password)){
            System.out.println("Please re-enter your password");

            input = scan.nextLine();
        }
        System.out.println("Logged in");


    }
}
