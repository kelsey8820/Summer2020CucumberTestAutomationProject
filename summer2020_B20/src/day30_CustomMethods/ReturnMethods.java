package day30_CustomMethods;

public class ReturnMethods {

    public static void main(String[] args) {
        addition1(3,4);

        int sum = addition2(10,20);
        System.out.println(sum);
    }

    public static void addition1(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static int addition2(int a, int b){
        int sum = a+b;
        return sum;
    }
}
