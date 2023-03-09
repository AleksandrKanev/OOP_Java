package home_work_2.any;

import home_work_2.supe.*;
import home_work_2.supe.Runnable;

public class Duck extends Animal implements Flyable, Swimable, Runnable, Speakable {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public int getFlightSpeed() {
        return 40;
    }

    @Override
    public int getRunningSpeed() {
        return 2;
    }

    @Override
    public void speak() {
        System.out.println("Гага!");

    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}