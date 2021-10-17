package app;

import app.vehicle.Car;


public class App {
    public static void main(String[] args) {

        Integer i = -5;
        Integer z = 5;
        Integer x = 5;


        System.out.println("----While-----"); //nie znamy liczby obiegów w pętli

        while (i < 0 ) {
            System.out.println(i);
            i++;
        }
        while (z > 0 ) {
            System.out.println(z);
            z--;
        }

        System.out.println("----doWhile-----");
        do{
            System.out.println(x);
            x--;
        } while(x > 0);

        System.out.println("----for-----");// znamy liczbę obiegów w pętli
        for (int c = 0; c < 5; c++) {
            System.out.println(c);
        }


    }
}
