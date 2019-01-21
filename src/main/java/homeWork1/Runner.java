package homeWork1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Runner {

    public static void main(String[] args) {


        HashMap<String, Cat> hashMapCat = new HashMap<String, Cat>();

        hashMapCat.put("Pushok", new Cat());
        hashMapCat.put("Murzik", new Cat());
        hashMapCat.put("Lu", new Cat());

        for (int i = 0; i < 3; i++) {
            System.out.println(hashMapCat);
        }
    }
}
