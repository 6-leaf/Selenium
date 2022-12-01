package Class08;

public class Tesla extends Cars{

    public Tesla(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Tesla drives using " + fuelType);
    }
}
