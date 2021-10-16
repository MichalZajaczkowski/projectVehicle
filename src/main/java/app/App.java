package app;

import app.vehicle.Car;
import app.vehicle.Engine;

public class App {
    public static void main(String[] args) {

        Car myCar = new Car("myCar");
        myCar.printName();

        Car myCar2 = new Car("myCar2");
        myCar2.printName();

        Engine engine1 = new Engine();
        engine1.setPower(100);
        engine1.setCapacity(1000);

        Engine engine2 = new Engine();
        engine2.setPower(200);
        engine2.setCapacity(2000);

        engine1.printPower();
        engine1.printCapacity();
        engine2.printPower();
        engine2.printCapacity();


        System.out.println("________");

        Car myCar3 = new Car("myCar3");
        myCar3.setEngine(engine1);
        Car myCar4 = new Car("myCar4");
        myCar4.setEngine(engine2);

        myCar3.printName();
        myCar3.getEngine().printPower();
        myCar3.getEngine().printCapacity();

        myCar4.printName();
        myCar4.getEngine().printPower();
        myCar4.getEngine().printCapacity();
        /////////////////////
        System.out.println("________");
        StaticExample.staticMethod();
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();

    }
}
