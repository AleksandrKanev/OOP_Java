package home_work_2.any;

import home_work_2.supe.*;


public class Fish extends Animal implements Swimable {
    public Fish(String name,String color) {
        super(name, color, 0);
    }
    public Fish(String name) {
        this(name, "белая");
    }


    @Override
    public int getSwimSpeed() {
        return 12;
    }
}
