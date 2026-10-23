
public class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year, 4);
        this.numberOfDoors = doors;
    }

    public int getDoors() {
        return numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println(fullName()
                + " -> Car: the engine starts with a powerful roar.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: Car | Doors: " + numberOfDoors);
    }
}
