package day21_Loop;


import java.util.Scanner;

public class GroupPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your username:");
        String username=scan.nextLine();

        System.out.println("Please enter your password");
        String password=scan.nextLine();

        if(username.equals("John") && password.equals("123")){
            System.out.println("Logged in");
        }else{
            System.out.println("Please try again");
        }


    }
}
