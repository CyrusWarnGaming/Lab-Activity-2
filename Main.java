
public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("Ford", "Mustang", 2021, 2),
            new Motorcycle("KTM", "Duke", 2023, 373),
            new Truck("Mitsubishi", "Fuso", 2019, 8.0)
        };

        for (Vehicle v : vehicles) {

            v.displayInfo();
            v.startEngine();

            v.moveForward();
            v.moveBackwards();
            v.moveLeft();
            v.moveRight();

            System.out.println("Age: " + v.calculateAge());
            System.out.println("Vintage: " + v.isVintage());

            v.drive(15);
            v.drive(30, "market");
            v.drive(80, "airport", true);

            System.out.println("Total km: " + v.getTotalKm());
            System.out.println();
        }

        Vehicle car = vehicles[0];

        System.out.println(car.setYear(2000));
        System.out.println(car.getYear());

        System.out.println(car.setYear(2027));
        System.out.println(car.getYear());
    }
}
