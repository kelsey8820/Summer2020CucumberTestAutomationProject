package day03_sequences_Variables;

/*
task:

Variables: salary, tax

totalTax: = salary * tax;
salaryAfterTax = salary - TotalTax

100000, 0.28
 */

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 100000;
        double tax = 0.28;

        double totalTax = salary * tax; //28000
        double SalaryAfterTax = salary - totalTax; //72000

        System.out.println(totalTax);
    }
}
