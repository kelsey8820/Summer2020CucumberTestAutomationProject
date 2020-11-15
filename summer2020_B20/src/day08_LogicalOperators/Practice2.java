package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {
        int age= 12;
        String citizenship1= "USA";
        String citizenship2= "France";

        boolean eligableAge= age >= 18;
        boolean citizenshipStatus= citizenship1 == "USA" || citizenship2 == "USA";
                                   // "USA" == "USA" || "France" == "USA"
                                    // true          ||   False
                                    // true


    }
}
