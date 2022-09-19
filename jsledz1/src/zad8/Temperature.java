package zad8;

public class Temperature {
   private double farenheit;
    private double fTemp;

   public Temperature(double farenheit){
        this.fTemp = farenheit;
   }

   public void celsius(){
       System.out.println("W Celsjuszach" + (5.0/9.0) * (fTemp - 32.0));
   }
    public void kelvin(){
        System.out.println("W Kelvinach " + (( (5/9.0) * (fTemp - 32.0)) + 273.0));
    }

    public void setFarenheit(double farenheit) {

        this.farenheit = farenheit;
    }

    public double getFarenheit() {

        return farenheit;
    }
    public void setfTemp(double fTemp) {

        this.fTemp = fTemp;
    }

    public double getfTemp() {

        return fTemp;
    }

}
