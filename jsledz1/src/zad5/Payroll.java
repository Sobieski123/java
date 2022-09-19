package zad5;

public class Payroll {

    private String imie;
    private int ID ;
    private double stawka;
    private int liczbaGodzin;

    public Payroll(String imie, int ID, double stawka, int liczbaGodzin){
        this.imie = imie;
        this.ID = ID;
        this.stawka = stawka;
        this.liczbaGodzin = liczbaGodzin;
    }

    public void setImie(String imie) {

        this.imie = imie;
    }

    public String getImie() {

        return imie;
    }

    public void setDescription(int ID) {

        this.ID = ID;
    }

    public int getID() {

        return ID;
    }

    public void setStawka(double stawka) {

        this.stawka = stawka;
    }

    public double getStawka() {

        return stawka;
    }

    public void setLiczbaGodzin(int liczbaGodzin) {

        this.liczbaGodzin = liczbaGodzin;
    }

    public int getLiczbaGodzin() {

        return liczbaGodzin;
    }

    public void obliczanie(){
        System.out.println("Stawka brutto wynosi:" + (this.stawka * this.liczbaGodzin));
    }
}
