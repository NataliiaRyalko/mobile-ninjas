package homeWork1;

import java.util.HashMap;

public class Cat {

    private String name;
    private Cat cat = new Cat();



    public Cat(){
        this.cat = new Cat();
    }

    public void setCatName(String name){
        this.name = name;
    }
    public String getCatName (){
        return (this.name);
    }


}
