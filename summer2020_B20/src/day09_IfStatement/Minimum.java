package day09_IfStatement;
/*
 1. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
 */


public class Minimum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aIsMin = a < b && a < c;

        boolean bIsMin = aIsMin == false && b < c ;
        // b < a && b < c

        boolean cIsMin =  aIsMin == false && bIsMin == false;
        // c < a && c < b;

        double min = 0;

        if(aIsMin){
            min =  a;
        }

        if(bIsMin){
            min = b;
        }

        if(cIsMin){
            min = c;
        }

        System.out.println(min+" is the minimum number");







    }

}

