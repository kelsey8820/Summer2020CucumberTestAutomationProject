package day07_Unary_ShortHand;

public class Quiz {

    public static void main(String[] args) {

        int iNum=100;
        double dNum=200;
        float fNum=300;

        // iNum=fNum;
        fNum=iNum;
        dNum=fNum;


        System.out.println("result A"+0+1);
        //"Result A0" +1
        //"Result A01"

        System.out.println("Result B"+(1) + (2));
        //"Result B1 + 2
        //Result B12

    }
}
