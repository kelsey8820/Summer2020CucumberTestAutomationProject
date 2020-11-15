package day25_Practices;
/*
Write a program that can return the shortest string of text from a String array

 */

public class shortestString2 {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int minLength = arr[0].length(); //3

        for(String each :arr){  // to find out the minimum length of the string in arr
            int l = each.length();  // 4  8   4  8

            if(l < minLength){
                minLength = l;
            }
        }


        for(String each: arr){  // to see how many strings' lengths in the array is matching with minLength
            if(each.length() == minLength ){
                System.out.println(each);
            }
        }









    }
}