package day18_Loop;
/*
write a program that asks user's first and last name, then prints out the initials of the user

input:
cybertek
batch18

output:
your initial is:
CB
 */


import java.util.Scanner;

public class Warm_Up_Tasks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String firstName=input.next();
        String lastName=input.next();

        String initial=firstName.substring(0,1)+"."+lastName.substring(0,1)+".";

        initial=initial.toUpperCase();

        System.out.println(initial);




    }
}
