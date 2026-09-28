public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Lincoln", "Custom Limousine", 1941);
        Vehicle v2 = new Vehicle("Cadillac", "Fleetwood Series 60 Special", 1940);
        Vehicle v3 = new Vehicle("Cadillac", "Fleetwood 75", 1946);

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println();

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println();

        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
    }
}
