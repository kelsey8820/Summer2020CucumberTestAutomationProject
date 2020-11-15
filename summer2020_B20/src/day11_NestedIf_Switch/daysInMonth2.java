package day11_NestedIf_Switch;
/*
write a program that can find the number of days in a month
(MUST APPLY NESTED)
 */

public class daysInMonth2 {
    public static void main(String[] args) {
        int month = 12;
        boolean validNumber = month >=1 && month <= 12;
        boolean days28=month==2;
        boolean days30=month==4||month==6||month==9||month==11;
        boolean invalid=month < 1 || month > 12;

        String result= "";

        if(validNumber){ // for 28 days or 30 days or 31 days
            if(days28){
                result = "28 days";
            }else if(days30){
                result= "30 days";
            }else{
                result= "31 days";
            }

        }else {// invalid month
            result= "Invaid";
        }
        System.out.println(result);

    }
}
