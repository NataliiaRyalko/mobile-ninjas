package homeWork1.Cats;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {


        HashMap<String, Cat> hashMapCat = new HashMap<String, Cat>();

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Mu");
        Cat cat3 = new Cat("Lu");
        Cat cat4 = new Cat("Tos");
        Cat cat5 = new Cat("Atos");
        Cat cat6 = new Cat("Opol");
        Cat cat7 = new Cat("Top");
        Cat cat8 = new Cat("Phop");
        Cat cat9 = new Cat("Miau");
        Cat cat10 = new Cat("Muuu");


        hashMapCat.put(cat1.getCatName(), cat1);
        hashMapCat.put(cat2.getCatName(), cat2);
        hashMapCat.put(cat3.getCatName(), cat3);
        hashMapCat.put(cat4.getCatName(), cat4);
        hashMapCat.put(cat5.getCatName(), cat5);
        hashMapCat.put(cat6.getCatName(), cat6);
        hashMapCat.put(cat7.getCatName(), cat7);
        hashMapCat.put(cat8.getCatName(), cat8);
        hashMapCat.put(cat9.getCatName(), cat9);
        hashMapCat.put(cat10.getCatName(), cat10);


        System.out.println(hashMapCat.keySet());

        Iterator iterator = hashMapCat.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapEntryCat = (Map.Entry)iterator.next();
            System.out.println(mapEntryCat.getKey());
        }
    }
}
