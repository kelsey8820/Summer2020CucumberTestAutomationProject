package day27_recap;

public class forEachLoop {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        // print each element in a seperate line using for loop
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("====================================");

        // using the for each loop
        for(int each : arr){       // {1,2,3,4,5} is now assigned to each
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("======================================");

        //print the element in reversed order with for loop
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]+" ");
        }

        // Cannot reverse the element using for each loop!




    }
}
