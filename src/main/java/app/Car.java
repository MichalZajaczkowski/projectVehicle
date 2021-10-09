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

    public static void staticMethod() {
        System.out.println("To jest metoda statyczna");
    }
}
