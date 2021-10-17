package app;

import app.vehicle.Car;


public class App {
    public static void main(String[] args) {

        Integer number = 12;

        switch (number % 2) {
            case 0:
                System.out.println("liczba parzysta switch");
                break;
            case 1:
                System.out.println("liczba nieparzysta switch");
                break;
        }

        if (number % 2 == 0) {
            System.out.println("liczba parzysta if");
        } else {
            System.out.println("liczba nieparzysta if");
        }

        Car car1 = new Car("car1", 200);
        Car car2 = new Car("car2", 200);

        String nameOfFasterCar = getNameOfFasterCar(car1, car2);
        System.out.println(nameOfFasterCar);

        printNameOfFasterCar(car1, car2);
    }

    private static String getNameOfFasterCar(Car car1, Car car2) {
        String result;
        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            result = car1.getName();
        } else if (car1.getMaxSpeed() < car2.getMaxSpeed()) {
            result = car2.getName();
        } else {
            result = ("Prędkości są równe");
        }
        return result;
    }

    private static void printNameOfFasterCar(Car car1, Car car2) {
        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            car1.printName();
        } else if (car1.getMaxSpeed() < car2.getMaxSpeed()) {
            car2.printName();
        } else {
            System.out.println("Prędkości są równe");
        }
    }

}
