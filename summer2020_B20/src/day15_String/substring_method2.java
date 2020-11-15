package day15_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class substring_method2 {
    public static void main(String[] args) {

        String lastName="kElSeY";
        String firstChar= lastName.substring(0,1);
        String remaining=lastName.substring(1);

        lastName=firstChar.toUpperCase() + remaining.toLowerCase();

        System.out.println(lastName);




        String s2="I like the Java Programming Language";
        String language = s2.substring(7);

        System.out.println(language);






        String s = "I like Game of Thrones";
        String series = s.substring(7);

        System.out.println(series);
    }
}
