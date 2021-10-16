package app;

public class App {
    public static void main(String[] args) {

        System.out.println("___Calculator_____");

        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(6, 3));
        System.out.println(calculator.divide(5, 45));
        System.out.println(calculator.divide(1, 23));
        System.out.println(calculator.divide(13, 3));

    }
}
