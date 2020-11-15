package day07_Unary_ShortHand;

public class Post_VS_Pre {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a);  // 11


        int b = 10;
        System.out.println(b++); // 10
        System.out.println(b); // 11


        int c = 25;
        int d = c++; // d= 25; // c= 26;
        // d=? c=?
        System.out.println(c);
        System.out.println(d);

        System.out.println("=========================================");

        int A = 1;
        A = -A-- + A++ / -A-- * --A;
        // A=  -1 + 0 / 0 * -1
        // A= -1 + 0 * -1
        // A= -1 + 0= -1
        System.out.println(A);




    }

}
