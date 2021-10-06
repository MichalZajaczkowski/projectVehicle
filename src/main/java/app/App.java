package app;

public class App {
    public static void main(String[] args) {

        Car myCar = new Car("myCar");
        myCar.printName();

        Car myCar2 = new Car("myCar2");
        myCar2.printName();

        Engine engine1 = new Engine();
        engine1.power = 150;
        engine1.capacity = 1500;

        Engine engine2 = new Engine();
        engine2.power = 250;
        engine2.capacity = 2500;

        System.out.println(engine1.power);
        System.out.println(engine1.capacity);
        System.out.println(engine2.power);
        System.out.println(engine2.capacity);
    }
}
