package Class08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_IteratorIntro {
    public static void main(String[] args) {

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(5.7);
        doubleList.add(3.9);
        doubleList.add(45.89);
        doubleList.add(1.8);
        doubleList.add(17.65);

        System.out.println("doubleList = " + doubleList);
        System.out.println("doubleList.get(2) = " + doubleList.get(2));

        System.out.println(" ================================== ");
        System.out.println("Regular for loop");

        for (int i = 0; i < doubleList.size(); i++) {
            System.out.println(doubleList.get(i));
        }

        System.out.println(" ================================== ");
        System.out.println("For Each");

        doubleList.forEach(d -> System.out.println("d = " + d.intValue()));

        System.out.println(" ================================== ");
        System.out.println("Enhanced");

        for (double d : doubleList){
            System.out.println("d = " + d);
        }

        System.out.println(" ================================== ");
        System.out.println("iterator");

        Iterator<Double> doubleIterator = doubleList.iterator();
        while (doubleIterator.hasNext()){
            System.out.println(doubleIterator.next());
        }

    }
}
