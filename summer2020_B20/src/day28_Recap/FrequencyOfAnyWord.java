package day28_Recap;

public class FrequencyOfAnyWord {
    public static void main(String[] args) {

        String str = "catcatcatdogdog";

        int count = 0; // "cat"  (0,3)
        for(int i = 0; i <= str.length()-3; i++){
            if(str.substring(i, i+3).equals("cat")){
                count++;
            }

        }
        System.out.println(count);

    }
}
