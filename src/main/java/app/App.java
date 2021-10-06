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

        System.out.println(engine1.power);
        System.out.println(engine1.capacity);
        System.out.println(engine2.power);
        System.out.println(engine2.capacity);

        System.out.println("________");

        Car myCar3 = new Car("myCar3");
        myCar3.engine = engine1;
        Car myCar4 = new Car("myCar4");
        myCar4.engine = engine2;

        System.out.println(myCar3.name);
        System.out.println(myCar3.engine.power);
        System.out.println(myCar3.engine.capacity);

        System.out.println(myCar4.name);
        System.out.println(myCar4.engine.power);
        System.out.println(myCar4.engine.capacity);

    }
}
