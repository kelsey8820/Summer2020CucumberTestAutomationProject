package day12_Switch_Scanner;
/*
write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. asks the user how many hours does he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary/ (weeklyHour * 52)
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class HourlyRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your annual salary: ");
        double salary =  input.nextDouble();
        System.out.println("How many hours do you work in a week");
        int weeklyHour = input.nextInt();  // 40 hours in a week

        int totalHours = weeklyHour * 52;

        double hourlyRate = salary / totalHours;

        System.out.println("Your hourly rate is: $"+hourlyRate);


    }

}
