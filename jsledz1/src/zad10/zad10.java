package zad10;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        graWoczko gra = new graWoczko();
        String tak = "tak";
        String nie = "nie";
        int wynik = 0;
        double sumaGracza = 0;
        double sumaKomputera = 0;

        System.out.println("chcesz grac dalej");
        String wybor = keyboard.nextLine();
        while(sumaGracza<21 && sumaKomputera <21 && wybor.equals(tak)){
            System.out.println("chcesz grac dalej");
            System.out.println("twoja suma to :"+ sumaGracza + "suma kompa to: " + sumaKomputera);
            wybor = keyboard.nextLine();
            sumaGracza += gra.rzutGracza();
            sumaKomputera += gra.rzutKomputera();
        }
        System.out.println("twoja suma to :"+ sumaGracza + "suma kompa to: " + sumaKomputera);
    }


}
