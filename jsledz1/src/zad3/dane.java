package zad3;

public class dane {

    private String imie;
    private String adres;
    private int wiek;
    private int numerTelefonu;

    public dane(String imie, String adres, int wiek, int numerTelefonu){
     this.imie = imie;
     this.adres = adres;
     this.wiek = wiek;
     this.numerTelefonu = numerTelefonu;
    }
    public void setName(String imie) {

        this.imie = imie;
    }

    public String getImie() {

        return imie;
    }
    public void setAdres(String adres) {

        this.adres = adres;
    }

    public String getAdres() {

        return adres;
    }
    public void setWiek(int wiek) {

        this.wiek = wiek;
    }

    public int getWiek() {

        return wiek;
    }
    public void setNumer(int numerTelefonu) {

        this.numerTelefonu = numerTelefonu;
    }

    public int getNumer() {
        return numerTelefonu;
    }

}
