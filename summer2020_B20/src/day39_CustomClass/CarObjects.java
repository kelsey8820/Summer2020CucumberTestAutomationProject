package day39_CustomClass;

public class CarObjects {


    public static void main(String[] args) {



        Car car1 = new Car();

        /*
         car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.color = "White";
        car1.mileage = 20000;
        car1.price = 19000.50;
         */

        car1.setInfo("Toyota", "Corolla", 2010, "Red", 55000, 16000);


        System.out.println( car1.brand );
        System.out.println( car1.model );
        System.out.println( car1.year );
        System.out.println( car1.color );

        System.out.println("=============================");

        Car car2 = new Car();
        /*
        car2.brand = "Mercedes";
        car2.model = "G 550";
        car2.year = 2000;
        car2.color = "Blue";
         */

        car2.setInfo("BMW", "X5", 2018, "Black", 15000, 40000);


        System.out.println( car2.brand  );
        System.out.println( car2.model  );
        System.out.println( car2.year  );
        System.out.println( car2.color  );

        System.out.println("=================================");

        Car car3 = new Car();

        car3.setInfo("Lexus", "LX", 2020, "White", 10000, 87000);

        System.out.println( car3.brand  );
        System.out.println( car3.model  );
        System.out.println( car3.year  );
        System.out.println( car3.color  );
        System.out.println(car3.mileage);
        System.out.println(car3.price);

        System.out.println("============================");


        Car car4 = new Car();

        car4.setInfo("Toyota", "Camry", 2020, "Black", 5000, 20000);


        car3.getInfo();
        car4.getInfo();







    }

}
