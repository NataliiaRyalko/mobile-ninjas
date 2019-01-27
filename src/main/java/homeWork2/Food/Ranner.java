package homeWork2.Food;

import java.util.HashSet;
import java.util.Iterator;

public class Ranner {

    public static void main(String[] args) {
        HashSet<String> hashSetFood = new HashSet<String>();
        hashSetFood.add("арбуз");
        hashSetFood.add("банан");
        hashSetFood.add("вишня");
        hashSetFood.add("груша");
        hashSetFood.add("дыня");
        hashSetFood.add("ежевика");
        hashSetFood.add("женьшень");
        hashSetFood.add("земляника");
        hashSetFood.add("ирис");
        hashSetFood.add("картофель");

        System.out.println("---------------------------------");
        System.out.println("First try:");
        System.out.println("---------------------------------");

        Iterator iterator = hashSetFood.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------------------------");
        System.out.println("Second try:");
        System.out.println("---------------------------------");

        iterator = hashSetFood.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
