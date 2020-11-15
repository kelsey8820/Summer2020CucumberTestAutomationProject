package day27_recap;

public class ForEachLoop_Practice {
    public static void main(String[] args) {

        int [] scores1 = {10,20,30,40,50,60,70,80,90,100,110};

        for(int each : scores1 ){
            if( each % 3 !=0){   // divisible by 3
                continue;
            }
            System.out.println(each+" ");
        }


        System.out.println();

        System.out.println("==================================");

        // print the names that contain C
        String [] names = {"AB", "ABC", "A", "AB", "ABCD"};

        for(String each : names ){
            if(!each.contains("C")){
               continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("====================================");

        // Find the min and max from the array
        int [] scores = { 80,75,65,110,90,45,56,78};

        int max = scores[0];
        int min = scores[0];

        for(int each : scores){
            if(each > max){
                max = each;
            }
            if(each<min){
                min = each;
            }

            System.out.println("Max Number: "+ max);
            System.out.println("Min Number: "+ min);


        }


    }
}
