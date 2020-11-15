package day06_ComparisonOperators;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean r1=10 > 9;
        System.out.println(r1);

        boolean r2= 100<9000;
        System.out.println(r2);

        // >= great than or equal to

        boolean r3=87 >=85;
        System.out.println(r3);

        boolean r4= 877 >= 879;
        System.out.println(r4);

        boolean r5= 200 <= 300;
        System.out.println(r5);

        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7= true == false;
        System.out.println(r7);

        boolean r8= "Muhtar" == "good guy";
        System.out.println(r8);

        boolean r11= "Muhtar" != "Bad guy";
        System.out.println(r11);

        boolean r12= true != false;
        System.out.println(r12);

        boolean result1= 'A'==65;
        System.out.println(result1);

        int number = 100;
        boolean even= number%2 ==0;
        System.out.println(even);

        boolean odd= number%2 != 0;
        System.out.println(odd);
    }
}
