package day07_Unary_ShortHand;

public class Positive_Negative_0 {

    public static void main(String[] args) {

        int number= 120;
        boolean result= number>0;
        boolean result1= number<0;
        boolean result2= number==0;

        System.out.println(number+ " "+"is a positive number:"+" "+result);
        System.out.println(number+ " "+"is a negative number:"+" "+result1);
        System.out.println(number+ " "+"is zero:"+" "+result2);


     // -- :
        int a = 20;
        // a = a-1; // 19
        --a;
        System.out.println(a);

        // ++
        int b = 10;
        // b= b + 1; // b = 11;
        ++b;
        System.out.println(b);

        //pre:

        int x= 100;
        System.out.println(++x); // 101

        int y=200;
        System.out.println(--y); // 199

        int z = 80;
        System.out.println(++z); //
        System.out.println(--z);







    }
}
