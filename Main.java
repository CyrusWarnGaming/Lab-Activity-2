// Java Polymorphism Activity

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Nissan", "Skyline GT-R", 1999, 4);
        Vehicle v2 = new Vehicle("Subaru", "Impreza WRX", 2004, 4);
        Vehicle v3 = new Vehicle("Hyundai", "Elantra", 2022, 4);

        System.out.println("=== Original Vehicles ===");

        Vehicle[] originals = {v1, v2, v3};

        for (Vehicle v : originals) {
            v.displayInfo();
            System.out.println("Age: " + v.calculateAge());
            System.out.println("Vintage: " + v.isVintage());
            System.out.println("Getter Brand: " + v.getBrand());
            System.out.println("Getter Model: " + v.getModel());
            System.out.println("Getter Year: " + v.getYear());
            System.out.println();
        }

        System.out.println("=== setYear Tests ===");

        System.out.println("setYear(2000): " + v1.setYear(2000));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        System.out.println("setYear(1885): " + v1.setYear(1885));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println();

        System.out.println("setYear(2027): " + v1.setYear(2027));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println();

        System.out.println("=== Invalid Constructor Tests ===");

        Vehicle invalid1 = new Vehicle("Test", "Vehicle", 1885);
        System.out.println("New vehicle with year 1885");
        System.out.println("Initial year: " + invalid1.getYear());
        System.out.println();

        Vehicle invalid2 = new Vehicle("Test", "Vehicle", 2027);
        System.out.println("New vehicle with year 2027");
        System.out.println("Initial year: " + invalid2.getYear());
        System.out.println();

        List<Vehicle> garage = new ArrayList<>();

        garage.add(new Car("Ford", "Mustang GT", 2021, 2));
        garage.add(new Motorcycle("KTM", "390 Duke", 2023, 373));
        garage.add(new Truck("Mitsubishi Fuso", "Fighter", 2019, 8.0));

        System.out.println("=== Runtime Polymorphism ===");

        for (Vehicle vehicle : garage) {
            vehicle.displayInfo();
            vehicle.startEngine();
            System.out.println();
        }

        System.out.println("=== Compile-Time Polymorphism ===");

        for (Vehicle vehicle : garage) {
            vehicle.drive(15);
            vehicle.drive(30, "the market");
            vehicle.drive(80, "the airport", true);

            System.out.println("Total distance: "
                    + vehicle.getTotalKm() + " km");
            System.out.println();
        }
    }
}
