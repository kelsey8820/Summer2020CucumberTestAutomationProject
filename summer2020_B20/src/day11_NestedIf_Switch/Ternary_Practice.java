package day11_NestedIf_Switch;


public class Ternary_Practice {
    public static void main(String[] args) {

        int age = 16;
        String citizen = "USA";

        String result= "";

        if(age >= 18 && citizen == "USA"){
            result = "Can vote";
        }
        else{
            result = "Can not vote";
        }
        System.out.println(result);

        //Ternary
        String result2 = (age >= 18 && citizen == "USA") ? "Can vote":"Can not vote";
        System.out.println(result2);


        // third task: write a program that can check if two numbers are equal or not.
        int n1 = 100;
        int n2 = 200;

        String r = (n1 == n2) ? "Equal" : "Not Equal";
        // "equal" or "not equal"

        System.out.println(r);
    }

}
