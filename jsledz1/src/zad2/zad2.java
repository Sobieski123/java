package zad2;

public class zad2 {
    public static void main(String[] args) {
        Car auto1 = new Car(2005, "AUDI");

    for(int i =0; i < 5; i++){


        System.out.println(auto1.getMake());
        System.out.println(auto1.getSpeed());
        auto1.accelerate();
    }
    }
}
