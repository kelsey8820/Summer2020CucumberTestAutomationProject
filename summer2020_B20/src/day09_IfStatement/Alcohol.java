package day09_IfStatement;
//4. write a java program that can identify if a person is eligible to buy alcohol

public class Alcohol {
    public static void main(String[] args) {
        boolean hasID= true;
        int age= 19;

        boolean eligible = hasID && age>=21;
        //                 true && false
        //                   =false
        if(eligible == true){
            System.out.println("Eligible to buy alchol");
        }

        if(eligible == false){
            System.out.println("Not eligble to buy alcohol");

        }
    }
}
