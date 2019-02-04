package homeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListStringCountLenth {
    public static void main(String[] args) throws IOException {


        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();

        list.add(reader.readLine());
        String string = list.get(0);
        int lenght;
        int newLenght = string.length();

        for (int i = 1; i < 10; i++) {
            list.add(reader.readLine());
            string = list.get(i);
            lenght = string.length();

            if(lenght > newLenght) {
                newLenght = lenght;
            }else{
                System.out.println(i);
                break;
            }


        }

    }




}
