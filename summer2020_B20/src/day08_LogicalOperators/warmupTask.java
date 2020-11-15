package day08_LogicalOperators;
/*
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */

public class warmupTask {
    // first task
    public static void main(String[] args) {
        double gallons= 15;
        double liter= gallons * 3.785;
        System.out.println(gallons+ " gallons is equal to "+ liter + " liters");

        // second task = liters to gallons
        double liters= 200;
        double gallons1= liters/3.785;
        System.out.println(liters + " liters is equal to "+ gallons1);

        // third task 1.
        int a = 200;
        int b= -a++ + - --a * a-- %2;
        // b= -200 -200 * 200 %2;
        // b= -200 - 40000 % 2
        // b= -200 - 0= -200
        // b= -200

        // third task 2.
        int x=300;
        int y= 400;
        int z= x + y - x * y + x/y;
        //z= 300 + 400 - 300 * 400 + 300/400;
        // z= 300 + 400 - 120000 + 300/ 400 (0.75);
        //z= 300 + 400 - 120000 + 0
        //z= -119300

    }
}
