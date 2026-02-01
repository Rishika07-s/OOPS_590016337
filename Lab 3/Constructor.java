import java.util.Scanner;

class Car {

    int modelYear;
    int mileage;

    Car(int year, int mile) {
        modelYear = year;
        mileage = mile;
    }

    String display() {
        return "Model Year: " + modelYear + "\nMileage: " + mileage;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter model year and mileage for Car 1:");
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("Enter model year and mileage for Car 2:");
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();

        Car C1 = new Car(y1, m1);
        Car C2 = new Car(y2, m2);

        System.out.println("\nCar 1 Details:");
        System.out.println(C1.display());

        System.out.println("\nCar 2 Details:");
        System.out.println(C2.display());
    }
}
