package zad7;

public class Circle {
    private double radius;
    private final double PI = 3.14159;


    public Circle( double radius){
        this.radius = radius;
    }


    public Circle(){
        this.radius = 0.0;
    }

    public void area(){
        System.out.println("Pole kola wynosi " + (PI * radius * radius));
    }

    public void diameter(){
        System.out.println("Srednica kola wynosi" + (radius*2));
    }

    public void circumference(){
        System.out.println("Obwod kola: " + (2*PI*radius));
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

}
