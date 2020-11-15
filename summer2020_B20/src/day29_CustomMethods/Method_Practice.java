package day29_CustomMethods;
/*
task:
    1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 1~100

 */

public class Method_Practice {
    public static void main(String[] args) {
        oddNumbers();
        System.out.println("Hello");

        oddNumbers();
        System.out.println("hello");

        evenNumbers();
        System.out.println("Hello");
    }

    //task 1:
    public static void oddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    // task 2:
    public static void evenNumbers(){
        for(int i=2; i<=100; i+=2){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}

