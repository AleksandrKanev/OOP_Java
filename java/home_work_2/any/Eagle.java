package home_work_2.any;

import home_work_2.supe.*;
import home_work_2.supe.Runnable;

public class Eagle extends Animal implements Flyable, Swimable, Runnable, Speakable {
    public Eagle(String name,String color) {
        super(name, color, 2);
    }
    public Eagle(String name) {
        this(name, "черный");
    }

    @Override
    public int getFlightSpeed() {
        return 80;
    }

    @Override
    public int getRunningSpeed() {
        return 4;
    }

    @Override
    public void speak() {
        System.out.println("Клек!");

    }

    @Override
    public int getSwimSpeed() {
        return 1;
    }
}
