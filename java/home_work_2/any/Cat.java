package home_work_2.any;

import home_work_2.supe.Animal;
import home_work_2.supe.Runnable;
import home_work_2.supe.Speakable;
import home_work_2.supe.Swimable;

public class Cat extends Animal implements Runnable, Swimable, Speakable {

    public Cat(String name, String color) {
        super(name, color, 4);
    }


    @Override
    public void speak() {
        System.out.println("Мяу!");

    }

    @Override
    public int getSwimSpeed() {
        return 1;
    }

    @Override
    public int getRunningSpeed() {
        return 10;
    }
}


