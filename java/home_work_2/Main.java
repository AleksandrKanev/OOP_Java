package home_work_2;

import home_work_2.any.*;
import home_work_2.supe.*;
import home_work_2.supe.Runnable;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinc vetClincAnimals = new VetClinc();
        vetClincAnimals.addAnimals(new Dog("Барсик"));
        vetClincAnimals.addAnimals(new Cat("Вася", "Белый"));
        vetClincAnimals.addAnimals(new Duck("Утка", "Серый"));
        vetClincAnimals.addAnimals(new Fish("Окунь"));
        vetClincAnimals.addAnimals(new Eagle("Орел"));
        vetClincAnimals.addAnimals(new Shark("Акула"));
        vetClincAnimals.addAnimals(new Raven("Ворон"));


        vetClincAnimals.allAble();

        Dog doc = new Dog("bob");
        System.out.println(doc.getRunningSpeed());


    }

}