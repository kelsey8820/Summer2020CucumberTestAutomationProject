package day14_Recap;
/*
1. write a program that can caluclate the garade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
 */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your score: ");
        double score= scan.nextDouble();

        String result="";

        if(score>=90 && score<=100){
            result="Excellent";
        }else if(score>=80 && score <= 89){
            result="Great";
        }else if(score>=70 && score<=79){
            result="Good";
        }else if(score>=60 && score <=69){
            result="Passed";
        }else if(score>=50 && score<=59){
            result="Failed";
        }else{
            result="Invalid entry";
        }
        System.out.println(result);


    }
}
