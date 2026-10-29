
public class Truck extends Vehicle {

    private double capacity;

    public Truck(String brand, String model, int year, double capacity) {
        super(brand, model, year, 6);
        this.capacity = capacity;
    }

    public double getCargoCapacityTons() {
        return capacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity + " tons");
    }

    @Override
    public void moveForward() {
        System.out.println("A truck moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A truck moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A truck turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("A truck turns right");
    }
}
