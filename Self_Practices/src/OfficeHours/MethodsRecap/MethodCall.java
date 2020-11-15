package OfficeHours.MethodsRecap;



public class MethodCall {

    public static void main(String[] args) {

        double[] arr1 = {1.5,05,2.5,6.5};

        Practice1.printArray(arr1);

        String str = "AABBBBBBCCCCCCDDDDEEEEEAABBBBBCCCCC";
        String nonDup="";
        for(int i = 0; i<=str.length()-1; i++){
            if(!nonDup.contains(""+str.charAt(i))){

            }
        }
        System.out.println(nonDup);

        //String str2 = "MMMMMNNNNNMMMMNNNN";
        // String nonDup2 = Util.removeDup(str2);  IMPORT FROM libraries--Util class
        // System.out.println(nonDup2);

    }
}
