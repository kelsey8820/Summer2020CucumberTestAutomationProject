package day12_Switch_Scanner;

import java.sql.SQLOutput;

public class Switch {
    public static void main(String[] args) {
        int num = 1;

        switch(num){

            case 5:
                System.out.println("Friday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
