package zad2;

public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make  = make;
        this.speed  = 0;
    }

    public void accelerate(){
        speed = speed + 5;
    }

    public void brake(){
        speed = speed - 5;
    }

    public void setYearModel(int yearModel) {

        this.yearModel = yearModel;
    }

    public int getYearModelar() {

        return yearModel;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getMake() {

        return make;
    }
    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public int getSpeed() {

        return speed;
    }

}
