package day10_IfStatements;
/*
1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
2. write a program that can identify if the given character character is Digit
                ex:
                    character = '1'
                output:
                    1 is a Digit
                    character  = '!'
                output:
                    ! is not a digit
3. write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol
 */

public class Character_Identify {
    public static void main(String[] args) {
        char character = 'A';
        //                        65 <= character <= 90             ||   97 <= character <= 122
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //           upper case letters     ||  lower Case letter
        // 48 <= CHARACTER <= 57
        boolean isDigit = character >= 48  && character <= 57;

        String alphabet = "";

        if(isAlphabetic == true) {
            //    System.out.println(character + " is Alphabetic character");
            alphabet = character + " is Alphabetic character";

        }else {
            //   System.out.println(character + " is not Alphabetic character");
            alphabet = character + " is not Alphabetic character";
        }

        System.out.println(alphabet);

        String digit = "";

        if(isDigit == true ){
            digit = character+" is a digit";
        }else{
            digit =  character+" is not a digit";
        }

        System.out.println(digit);



    }

}