package Class08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_IteratorDemo {
    public static void main(String[] args) {

        List randomList = new ArrayList<>();
        
        randomList.add("Apple");
        randomList.add("Orange");
        randomList.add(20);
        randomList.add(84.56);
        randomList.add(true);
        randomList.add(10==5);
        randomList.add('f');

        System.out.println("randomList = " + randomList);

        System.out.println("--- Iterator ---");
        
        Iterator iterator = randomList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("--- Enhanced ---");

        for (Object item : randomList){
            System.out.println("item = " + item);
        }
    }

}
