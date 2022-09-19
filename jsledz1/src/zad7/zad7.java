package zad7;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj proimien kola");
        double promien = keyboard.nextDouble();
       Circle kolo = new Circle(promien);
       kolo.area();
       kolo.diameter();
       kolo.circumference();
    }
}
