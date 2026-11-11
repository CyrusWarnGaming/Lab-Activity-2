
public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Ford", "Mustang", 2021, 2);
        Motorcycle bike = new Motorcycle("KTM", "Duke", 2023, 373);
        Truck truck = new Truck("Mitsubishi", "Fuso", 2019, 8.0);
        Printer printer = new Printer();

        System.out.println("=== SERVICEABLE INTERFACE ===");

        Serviceable[] items = {car, bike, truck, printer};

        for (Serviceable item : items) {
            performService(item);
        }

        System.out.println();

        System.out.println("=== VEHICLE ABSTRACTION ===");

        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            System.out.println();
        }
    }
}
