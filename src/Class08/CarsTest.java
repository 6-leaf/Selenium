package Class08;

import java.util.Arrays;
import java.util.Iterator;

public class CarsTest {
    public static void main(String[] args) {

        //Regular way of storing objects in array

        Cars[] carsArray = {
                new Toyota("Gasoline"),
                new Honda("Gasoline"),
                new Tesla("Electric")
        };

        System.out.println("--- Enhanced Loop -");
        for (Cars car : carsArray){
            car.fuelType();
        }

        System.out.println("--- Iterator ---");
        Iterator<Cars> iterator = Arrays.stream(carsArray).iterator();
         while (iterator.hasNext()){
             iterator.next().fuelType();
         }
    }
}
