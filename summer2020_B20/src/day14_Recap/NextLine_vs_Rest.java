package day14_Recap;

import java.util.Scanner;

public class NextLine_vs_Rest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age= input.nextInt();

        System.out.println("Enter your full name: ");
        String fullName= input.nextLine();
    }
}
