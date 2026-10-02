public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Lincoln", "Custom Limousine", 1941);
        Vehicle v2 = new Vehicle("Cadillac", "Fleetwood Series 60 Special", 1940);
        Vehicle v3 = new Vehicle("Cadillac", "Fleetwood 75", 1946);

        System.out.println("=== Original Vehicles ===");

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println("Getter Brand: " + v1.getBrand());
        System.out.println("Getter Model: " + v1.getModel());
        System.out.println("Getter Year: " + v1.getYear());
        System.out.println();

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println("Getter Brand: " + v2.getBrand());
        System.out.println("Getter Model: " + v2.getModel());
        System.out.println("Getter Year: " + v2.getYear());
        System.out.println();

        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
        System.out.println("Getter Brand: " + v3.getBrand());
        System.out.println("Getter Model: " + v3.getModel());
        System.out.println("Getter Year: " + v3.getYear());
        System.out.println();

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
    }
}