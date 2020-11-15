package day27_recap;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {

        /*
        sort():
        toString():
        equals():
         */
        // sort array
        String [] names = {"Odina", "Liliia", "Emine", "Berk"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int [] score = {80,75,65,110,90,45,56,78};

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maxium: "+ score[score.length-1]);
        System.out.println("Minimum: "+score[0]);


        System.out.println("=========================================");

        // complare the two arrays and see if they are equal
        String [] s1 = {"A", "B", "C"};
        String [] s2 = {"A", "B", "C"};

        System.out.println( Arrays.equals(s1, s2));

        String [] s3 = {"C", "A", "B"};

        System.out.println( Arrays.equals(s1, s3));  // false

        String [] a1 = {"A", "C", "B"};
        String [] a2 = {"B", "A", "C"};

        Arrays.sort(a1); // a1: {A B C};
        Arrays.sort(a2); // a2: {A B A};
        System.out.println( Arrays.equals(a1, a2));

        String w1 = Arrays.toString(a1);
        System.out.println(w1);












    }
}
