package day08_LogicalOperators;

public class Logical {

    public static void main(String[] args) {
        // !: opposite boolean
        boolean r1= 9>7; // true
        boolean r2= !r1;  //false
        System.out.println(r1 + " : "+r2);

        System.out.println(!false); // true
        System.out.println(!true); // false

        boolean r3= !false == true; // true
                  // true == true
        System.out.println(r3);

        boolean r4= true == !true; // false
                 // true == false
        System.out.println(r4);


    }
}
