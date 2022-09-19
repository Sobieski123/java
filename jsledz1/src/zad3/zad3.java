package zad3;

public class zad3 {
    public static void main(String[] args) {
        dane osoba1 = new dane("Jakub", "Johna 123", 17, 987654345);
        System.out.println("Imie:"+ osoba1.getImie());
        System.out.println("Adres:" + osoba1.getAdres());
        System.out.println("Wiek:" + osoba1.getWiek());
        System.out.println("Numer telefonu:" + osoba1.getNumer());
    }
}
