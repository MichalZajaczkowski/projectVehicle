package app.vehicle;

public class Car {
    private String name;
    private Engine engine;
    private Integer maxSpeed;

    public Car() {

    }
    public Car(String name) {
        this.name = name;
    }

    public Car(String name, Integer maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
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

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
