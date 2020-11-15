package day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {
        String firstName= "Kelsey";
        String lastName= "Kalonova";
        int age= 19;
        String citizenShip= "USA";
        boolean eligableToVote= age >= 18 && citizenShip == "USA";
        System.out.println(firstName+ " "+lastName+ " is eligable to vote: "+ eligableToVote);


        // ||: OR

        boolean r8= true == !false || false == true;
        System.out.println(r8);

        boolean r9= !false== false || true == !false;
        System.out.println(r9);





    }
}
