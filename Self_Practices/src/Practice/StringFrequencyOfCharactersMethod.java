package Practice;

public class StringFrequencyOfCharactersMethod {
    public static void main(String[] args) {
        String str = "AAABBCDD";

        System.out.println(str);
    }

    public  static  String  FrequencyOfChars(String str) {

        String expectedResult = "";

        for( int j=0; j < str.length(); j++) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str.charAt(j)) {

                    count++;

                }

            }

            expectedResult +=str.charAt(j)+"" + count;

            str = str.replace(""+str.charAt(j) ,  "" );

        }

        return expectedResult;

    }
}
