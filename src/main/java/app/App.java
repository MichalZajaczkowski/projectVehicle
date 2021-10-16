package app;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Double result = calculator.divide(12, 5);

        if (isPositive(result)) {
            System.out.println(result + " > 0");
        } else if (!isPositive(result)) {
            System.out.println(result + " <= 0 ");
        }
    }

    private static boolean isPositive(Double result) {
        return result > 0;
    }
}
