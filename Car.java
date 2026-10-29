
public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year, 4);
        this.numberOfDoors = doors;
    }

    public int getDoors() {
        return numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }

    @Override
    public void moveForward() {
        System.out.println("A car moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A car moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("A car turns right");
    }
}
