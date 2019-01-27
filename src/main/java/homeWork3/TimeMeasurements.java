package homeWork3;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeMeasurements {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        long timeStartForArrayList = System.currentTimeMillis();
        System.out.println("Current time START:" + System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            arrayList.add("first");
            arrayList.add("second");
            arrayList.get(0);
            arrayList.remove(1);
        }

        long timeEndForArrayList = System.currentTimeMillis();
        System.out.println("Current time END:" +System.currentTimeMillis());
        System.out.println("Measurment time of array list :" + (timeEndForArrayList - timeStartForArrayList));

        long timeStartForLinkedList = System.currentTimeMillis();
        System.out.println("Current time START:" +System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            linkedList.add("first");
            linkedList.add("second");
            linkedList.get(0);
            linkedList.remove(1);
        }
        System.out.println("Current time END:" +System.currentTimeMillis());
        long timeEndForLinkedList = System.currentTimeMillis();
        System.out.println("Measurment time of linked list :" + (timeEndForLinkedList - timeStartForArrayList));

    }
}
