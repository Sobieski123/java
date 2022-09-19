package ZAD9;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj miesiac:");
        int miesiac = keyboard.nextInt();
        System.out.println("Podaj rok");
        int rok = keyboard.nextInt();

        MonthDays zmienna = new MonthDays();
        zmienna.setMiesiac(miesiac,rok);
        zmienna.WYPISUJ();
    }
}
