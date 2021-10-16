package app.vehicle;

public class Car {
    private String name;
    private Engine engine;

    public Car() {

    }
    public Car(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
