package day06_ComparisonOperators;

public class implicit_explicit {

    public static void main(String[] args) {

        short s1=100;
        long l1=s1;  // implicit casting: automatically done

        long l2= (long)s1; // if we do implicit manually

        int I1=33;
        double D1=I1; // 300.0

        System.out.println(D1);

        double D2= (double) I1;

        System.out.println("=========================================");

        double d1=400.5555;
        int i1=(int) d1; //explicit casting // 400

        System.out.println(i1);

        long L1= 4400;
        short S1= (short)L1;

        System.out.println(S1);

        int n1= 1000;
        byte b1= (byte) n1;

        System.out.println(b1); // -24


        double m1 = 34.5;
        float f1 =(float) m1;

        System.out.println(f1);

        long r1= -500;
        int I2= (int) r1;

        System.out.println(I2);


        long r2=13;
        byte b2= (byte)r2;

        System.out.println(b2);

    }
}
