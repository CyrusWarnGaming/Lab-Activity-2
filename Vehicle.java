
public abstract class Vehicle {

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

        if (year >= 1886 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 2026;
        }

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
        System.out.println(fullName() + " engine started");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Wheels: " + numberOfWheels);
    }

    public void drive(int km) {
        totalKm += km;
        System.out.println(fullName() + " travelled " + km + " km");
    }

    public void drive(int km, String destination) {
        totalKm += km;
        System.out.println(fullName() + " goes to " + destination);
    }

    public void drive(int km, String destination, boolean highway) {
        totalKm += km;

        if (highway) {
            System.out.println(fullName() + " goes to " + destination + " using highway");
        } else {
            System.out.println(fullName() + " goes to " + destination + " using local road");
        }
    }

    public abstract void moveForward();
    public abstract void moveBackwards();
    public abstract void moveLeft();
    public abstract void moveRight();
}
