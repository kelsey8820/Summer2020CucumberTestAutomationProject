package day32_MethodOverLoading;
import java.util.Scanner;

public class formatFullName {

    
    // formatFullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String last = scan.nextLine();

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        // Convert first char to upper case           convert the rest of the characters to lower case
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first + " " + last);
    }

    public static String formatFullName(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        String fullName = first + " " + last;




        return fullName;
    }
}
