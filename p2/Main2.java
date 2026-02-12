package p2;
import p1.Car;

 public class Main2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.mileage = 25;
        c.price = 15000;

        System.out.println("Mileage: " + c.mileage);
        System.out.println("Price: " + c.price);
    }
    
}
