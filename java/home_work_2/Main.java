package home_work_2;

import home_work_2.any.*;
import home_work_2.supe.*;
import home_work_2.supe.Runnable;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinc vetClincAnimals = new VetClinc();
        vetClincAnimals.addAnimals(new Dog("������"));
        vetClincAnimals.addAnimals(new Cat("����", "�����"));
        vetClincAnimals.addAnimals(new Duck("����", "�����"));
        vetClincAnimals.addAnimals(new Fish("�����"));
        vetClincAnimals.addAnimals(new Eagle("����"));
        vetClincAnimals.addAnimals(new Shark("�����"));
        vetClincAnimals.addAnimals(new Raven("�����"));


        vetClincAnimals.allAble();

        Dog doc = new Dog("bob");
        System.out.println(doc.getRunningSpeed());


    }

}