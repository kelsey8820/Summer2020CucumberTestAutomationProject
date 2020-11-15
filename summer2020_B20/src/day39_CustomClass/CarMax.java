package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Toyota", "Corolla", 2018, "White", 300000, 25000);
        car2.setInfo("Lexus", "RX", 2020, "Black", 10000, 87000);
        car3.setInfo("Toyota", "Camry", 2019, "Silver", 50000, 20000);
        car4.setInfo("Lexus", "RX450", 2020, "White", 1000, 500000);
        car5.setInfo("Toyota", "Corolla", 2017, "Blue", 600000, 17000);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        car3.start();
        car5.start();
    }
}
