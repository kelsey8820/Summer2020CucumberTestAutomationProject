package day07_Unary_ShortHand;

public class Shorthand {

    public static void main(String[] args) {
        int a= 100;
        // a= a * a;
        a *= a;
        System.out.println(a);

        int b= 2;
        b *=3;
        System.out.println(b);

        int c= 300;
        c -=100;
        System.out.println(c);

        System.out.println("======================================");

        int z= 300;
        z += 200;
        System.out.println(z);

        String schoolName= "Cybertek";
        // schoolName= schoolName + "School";
        schoolName += "School";
        System.out.println(schoolName);

        String fullName= "Kelsey";
        fullName += "Kalonova";
        System.out.println(fullName);

        // /=
        int budget= 1000000;
        budget /= 2;
        System.out.println(budget);

        int x = 100;
        x/= 2;
        System.out.println(x);

        // %=
        int num = 100;
        num %=3;
        System.out.println(num);


    }
}
