package app;

public class App {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.name = "myCar";
        myCar.printName();

        Car myCar2 = new Car();
        myCar2.printName();
        myCar2.name = "myCar2";

    }
}
