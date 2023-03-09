package home_work_2.any;

import home_work_2.supe.Animal;
import home_work_2.supe.Flyable;
import home_work_2.supe.Speakable;
import home_work_2.supe.Runnable;


public class Raven extends Animal implements Flyable, Runnable, Speakable {
    public Raven(String name,String color) {
        super(name, color, 2);
    }
    public Raven(String name) {
        this(name, "черный");
    }

    @Override
    public int getFlightSpeed() {
        return 20;
    }

    @Override
    public void speak() {
        System.out.println("Кар,Кар!");

    }

    @Override
    public int getRunningSpeed() {
        return 3;
    }
}
