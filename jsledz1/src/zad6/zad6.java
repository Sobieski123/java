package zad6;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        int[] wyniki = new int[3];


        Scanner keyboard = new Scanner(System.in);
        TestScores oceny = new TestScores();
        for(int i =0; i < 3;i++) {
            System.out.println("Podaj wynik testu");
            wyniki[i] = keyboard.nextInt();
            oceny.setWyniki(wyniki[i]);
        } oceny.srednia();
    }
}
