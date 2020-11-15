package day14_Recap;
/*
1. write a program for the shipping info that, the program should ask:
                    building number (
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNumber=input.nextInt();

        input.nextLine();
        System.out.println("Enter your street address: ");
        String streetAddress=input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName=input.nextLine();

        System.out.println("Enter your state name: ");
        String stateName=input.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode=input.nextInt();

        input.nextLine();
        System.out.println("Enter full name of person: ");
        String fullName=input.nextLine();

        System.out.println(fullName+"\n"+buildingNumber+" "+streetAddress+" "
        +"\n"+cityName+", "+stateName+" "+zipCode);

    }




}
