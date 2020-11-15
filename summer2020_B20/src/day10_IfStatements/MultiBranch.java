package day10_IfStatements;

public class MultiBranch {
    public static void main(String[] args) {
        int number = 100;

        if(number > 0){
            System.out.println(number + " is postive");
        }
        if(number < 0){
            System.out.println(number + " is negative");
        }
        if(number == 0){
            System.out.println(number + " is zero");
        }

        // multi branch task

        if(number > 0){
            System.out.println(number + " is positive");
        }else if(number < 0){
            System.out.println(number + " is negative");
        }else{  // number == 0
            System.out.println(number + " is zero");
        }


    }
}
