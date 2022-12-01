package Class08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarTest2 {

    public static void main(String[] args) {
        //Using ArrayList to store objects

        List<Cars> carsList = new ArrayList<>();
        carsList.add(new Toyota("Gas"));
        carsList.add(new Honda("Gas"));
        carsList.add(new Tesla("Electric"));


        System.out.println("--- Enhanced Loop ---");
        for (Cars car : carsList){
            car.fuelType();
        }

        System.out.println("--- Iterator ---");
        Iterator<Cars> car = carsList.iterator();
        while (car.hasNext()){
            car.next().fuelType();
        }
    }
}
