package day09_IfStatement;
/*
 1. write a java program that accepts three numbers and return the medium number
                (assume that none of them are equal)
 */

import sun.java2d.SurfaceDataProxy;

public class MediumNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;

        boolean aIsMed = (a > b && a < c) || (a > c && a < b);
        boolean bIsMed = (b > c && b < a) || (b < c && b > a);
        boolean cIsMed = !aIsMed && !bIsMed;

        double med = 0;

        if(aIsMed){
            med = a;
        }
        if(bIsMed){
            med = b;
        }
        if(cIsMed){
            med = c;
        }
        System.out.println(med);
    }
}
