package zad5;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String imie = keyboard.nextLine();
        System.out.println("Podaj ID:");
        int ID = keyboard.nextInt();
        System.out.println("Podaj liczbe godzin:");
        int liczbaGodzin= keyboard.nextInt();
        System.out.println("Podaj wynagrodzenie za godzine:");
        double stawka = keyboard.nextDouble();

        Payroll pracownik1 = new Payroll(imie,ID,stawka,liczbaGodzin);

        pracownik1.obliczanie();
    }
}
