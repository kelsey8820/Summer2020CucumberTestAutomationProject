package day29_CustomMethods;

public class RemoveDuplicates {
    /*
    write a method that can remove the duplicates from the string
     */
    public static void main(String[] args) {
        String str = "ababababacdddddddeeeeeeeeee";
        removeDup(str);

    }
    public static void removeDup(String str){
        String nonDup = "";
        for(String each : str.split("")){
            if(!nonDup.contains(each)){
                nonDup += each;
            }
        }
        System.out.println(nonDup);

    }

}
