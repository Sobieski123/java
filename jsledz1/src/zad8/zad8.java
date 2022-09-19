package zad8;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj temperature w Farenheitach");
        double Farenheity = keyboard.nextDouble();

        Temperature obiekt = new Temperature(Farenheity);
        obiekt.celsius();
        obiekt.kelvin();

    }
}
