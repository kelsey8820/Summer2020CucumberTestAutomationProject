package day09_IfStatement;

public class Alcohol2 {
    public static void main(String[] args) {
        boolean hasID= true;
        int age= 26;

        boolean eligible = hasID && age>=21;
        //                 true && false
        //                   =false
        if(age >= 21){
            System.out.println("Eligible to buy alchol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }


    }
}

