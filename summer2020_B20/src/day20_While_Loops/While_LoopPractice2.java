package day20_While_Loops;

public class While_LoopPractice2 {
    public static void main(String[] args) {
        int num = 10;

        while (num < 15) {
            System.out.println("Kelsey");
            num++;
        }


         /*
         Reverse the string task: use while loop
          */

    String str = "Cybertek";
    //           01234567

    int index = str.length()-1;
    String result = "";

    while(index >=0){

        result += str.charAt(index);


        index--;
    }
        System.out.println(result);



    }





}