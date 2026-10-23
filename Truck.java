
public class Truck extends Vehicle {
    private final double payloadTons;

    public Truck(String brand, String model, int year, double cargoCapacityTons) {
        super(brand, model, year, 6);
        this.payloadTons = cargoCapacityTons;
    }

    public double getCargoCapacityTons() {
        return payloadTons;
    }

    @Override
    public void startEngine() {
        System.out.println(fullName()
                + " -> Truck: the heavy diesel engine starts rumbling.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: Truck | Payload: "
                + payloadTons + " tons");
    }
}
