package day26_Multi_DimensionsalArray;
import java.util.Arrays;
public class multiD_Array {
    public static void main(String[] args) {
       char[] ch1 = {'A', 'B'};
       char[] ch2 = {'C', 'D', 'E'};
       char[] ch3 = {'F', 'G', 'H'};
       //                 0    1      0    1    2      0    1    2
        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
        //                   0              1                 2
        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(Arrays.toString(ch2D[2]));

        // print the element "H"
        System.out.println(ch2D[2] [2]);

        // print the element "C"
        System.out.println(ch2D[1] [0]);

        //print the element "G B"
        System.out.println(ch2D[2] [1]+" "+ch2D[0] [1]);

        System.out.println("=====================================================");

        // {1,2,3}, {4}, {5,6}, {7,8,9,10}

        int [] [] int2D = {{1,2,3}, {4}, {5,6}, {7,8,9,10}};
        //                    0      1     2         3
        /*
        {1,2,3},
         {4},
         {5,6},
         {7,8,9,10}
         */
        for(int i = 0; i <= int2D.length-1; i++){
            System.out.println(Arrays.toString(int2D[i]));
        }
        // {1,2,3}, {4}, {5,6}, {7,8,9,10}
        System.out.println(Arrays.deepToString(int2D));




    }
}
