// Java Polymorphism Activity

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private int numberOfWheels;
    private double totalKm;

    public Vehicle(String brand, String model, int year) {
        this(brand, model, year, 0);
    }

    public Vehicle(String brand, String model, int year, int numberOfWheels) {
        this.brand = brand;
        this.model = model;
        this.year = (year >= 1886 && year <= 2026) ? year : 2026;
        this.numberOfWheels = numberOfWheels;
        this.totalKm = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getWheels() {
        return numberOfWheels;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }
        return false;
    }

    public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }

    protected String fullName() {
        return brand + " " + model;
    }

    public void startEngine() {
        System.out.println(fullName() + " -> Engine started.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    public void drive(int km) {
        totalKm += km;
        System.out.println(fullName() + " travelled " + km + " km.");
    }

    public void drive(int km, String destination) {
        totalKm += km;
        System.out.println(fullName() + " headed to " + destination
                + " (" + km + " km).");
    }

    public void drive(int km, String destination, boolean highway) {
        totalKm += km;
        String road = highway ? "via the highway" : "via local roads";
        System.out.println(fullName() + " went to " + destination
                + " " + road + " (" + km + " km).");
    }
}
