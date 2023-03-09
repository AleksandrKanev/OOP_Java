package home_work_2.any;

import home_work_2.supe.Animal;
import home_work_2.supe.Swimable;

public class Shark extends Animal implements Swimable {
    public Shark(String name,String color) {
        super(name, color, 0);
    }
    public Shark(String name) {
        this(name, "белая");
    }

    @Override
    public int getSwimSpeed() {
        return 30;
    }
}
