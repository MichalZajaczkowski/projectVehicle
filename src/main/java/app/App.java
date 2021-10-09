package app;

public class App {
    public static void main(String[] args) {

        Car myCar = new Car("myCar");
        myCar.printName();

        Car myCar2 = new Car("myCar2");
        myCar2.printName();

        Engine engine1 = new Engine();
        engine1.power = 100;
        engine1.capacity = 1000;

        Engine engine2 = new Engine();
        engine2.power = 200;
        engine2.capacity = 2000;

        engine1.printPower();
        engine1.printCapacity();
        engine2.printPower();
        engine2.printCapacity();


        System.out.println("________");

        Car myCar3 = new Car("myCar3");
        myCar3.engine = engine1;
        Car myCar4 = new Car("myCar4");
        myCar4.engine = engine2;

        myCar3.printName();
        myCar3.engine.printPower();
        myCar3.engine.printCapacity();

        myCar4.printName();
        myCar4.engine.printPower();
        myCar4.engine.printCapacity();
        /////////////////////
        System.out.println("________");
        Car.staticMethod();

    }
}
