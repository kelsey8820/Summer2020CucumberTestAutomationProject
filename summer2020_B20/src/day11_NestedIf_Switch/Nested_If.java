package day11_NestedIf_Switch;
/*
90 to 100 is A
80 to 89 is B
70 to 79 is C
60 to 69 is D
0 to 59 is F
other is invalid
 */

public class Nested_If {
    public static void main(String[] args) {

        int score = 100;
        String result = "";
        if (score >= 0 && score <= 100) { //valid score

            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else if (score >= 50) {
            } else { // invalid score
                result = "Invalid";
            }
            System.out.println(result);
        }
    }
}


