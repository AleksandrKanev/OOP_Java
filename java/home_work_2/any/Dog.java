package home_work_2.any;

import home_work_2.supe.Animal;
import home_work_2.supe.Runnable;
import home_work_2.supe.Speakable;
import home_work_2.supe.Swimable;

public class Dog extends Animal implements Runnable, Swimable, Speakable {

    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name){ this(name, "Черный");}

    @Override
    public int getRunningSpeed() {
        return 12;
    }

    @Override
    public void speak() {
        System.out.println("Гаф,Гаф!");

    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }
}


