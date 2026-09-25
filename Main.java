public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Lincoln", "Custom Limousine", 1941);
        Vehicle vehicle2 = new Vehicle("Cadillac", "Fleetwood Series 60 Special", 1940);
        Vehicle vehicle3 = new Vehicle("Cadillac", "Fleetwood 75", 1946);

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println();

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
} 
