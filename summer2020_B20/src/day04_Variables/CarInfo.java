package day04_Variables;

/*
Create a class call CarInfo:
Year
Brand
Model
color
Mileage
Price

print the info of the car
example:
2020
BMW
X5
black
30000
45000

output:
2020 BMW X5, 30000 miles, 45000 $
 */

import com.sun.corba.se.impl.encoding.BufferManagerWrite;

public class CarInfo {

    public static void main(String[] args) {
        int year = 2020;
        String brand = "BMW";
        String model = "X5";
        String color = "black";
        short mileage = 30000;
        double price = 45000;

        //2020 BMW X5, black, 30000 miles, $45000
        System.out.println(year+" "+brand+" "+model+", black, "+mileage+" miles"+" $"+price);


    }
}
