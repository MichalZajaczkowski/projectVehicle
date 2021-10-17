package app;


public class App {
    public static void main(String[] args) {

        System.out.println("----for-----");
        Integer value = 10;
        for (int i = 0; i < value; i++) {
            System.out.println(i);
        }

        System.out.println("----break - continue-----");
        method(14);
    }

    public static void method(int a) {

        for (int j = 0; j < a; j++) {
            if (j % 2 ==0) {
                continue;
            }
            if (j == 11) {
                break;
            }
            System.out.println(j);
        }
    }
}
