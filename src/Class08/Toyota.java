package Class08;

public class Toyota extends Cars{

    public Toyota(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Toyota drives using " + fuelType);
    }
}
