package day04_Variables;
/*
Create a class called PersonalInfo:
First name
Last name
country
SSN
Gender
isEmployed
 */

public class personalInfo {

    public static void main(String[] args) {

        String firstName = "Kelsey";
        String lastName = "Kalonova";
        int Age = 32;
        String Country = "United States";
        String SSN = "123-12-1234";
        char Gender = 'F';
        boolean isEmployed = true;

        System.out.println("First Name:" + firstName);
        System.out.println("Last Name:" + lastName);
        System.out.println("Age:" + Age);
        System.out.println("Country:" + Country);
        System.out.println("SSN:" + SSN);
        System.out.println("Gender:" + Gender);
        System.out.println("Is Employed:" + isEmployed);
    }
}
