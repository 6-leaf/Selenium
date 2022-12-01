package Class08;

public class Honda extends Cars{


    public Honda(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Honda drives using " + fuelType);
    }
}
