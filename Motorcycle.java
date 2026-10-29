
public class Motorcycle extends Vehicle {

    private int engineCC;

    public Motorcycle(String brand, String model, int year, int engineCC) {
        super(brand, model, year, 2);
        this.engineCC = engineCC;
    }

    public int getEngineCC() {
        return engineCC;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine CC: " + engineCC);
    }

    @Override
    public void moveForward() {
        System.out.println("A motorcycle moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A motorcycle moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A motorcycle turns left");
    }

    @Override
    public void moveRight() {
        System.out.println("A motorcycle turns right");
    }
}
