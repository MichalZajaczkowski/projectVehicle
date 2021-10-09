package app;

public class StaticExample {

    public static void staticMethod() {
        System.out.println("To jest metoda statyczna");
        // tu NIE mogę wywołać metody NIESstatycznEJ (nonStaticMethod)
    }

    public void nonStaticMethod() {
        System.out.println("To NIE jest metoda statyczna");
        // tu mogę wywołać metodę statyczną (staticMethod)
    }
}
