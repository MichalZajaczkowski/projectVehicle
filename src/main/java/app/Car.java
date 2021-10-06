package app;

public class Car {
    public String name;
    public int maxSpeed;
    public Engine engine;

    public Car() {

    }
    public Car(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
