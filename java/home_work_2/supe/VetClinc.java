package home_work_2.supe;

import java.util.ArrayList;
import java.util.List;

public class VetClinc {
    public final List<Animal> animals;

    public List<Animal> getAnimals() {
        return animals;
    }

    public VetClinc addAnimals(Animal animal){
        this.animals.add(animal);
        return this;
    }

    public VetClinc() {
        this.animals = new ArrayList<>();
    }

    public void allRunnable() {
        for (Animal a : animals) {
            if (a instanceof Runnable) {
                System.out.printf("%s - бегающий\n", a.getName());
            }
        }
    }
    public void allFlyable() {
        for (Animal a : animals) {
            if (a instanceof Flyable) {
                System.out.printf("%s - летающий\n", a.getName());
            }
        }
    }
    public void allSwimable() {
        for (Animal a : animals) {
            if (a instanceof Swimable) {
                System.out.printf("%s - плавающий\n", a.getName());
            }
        }
    }
    public void allAble() {
       allRunnable();
       allFlyable();
       allSwimable();
    }


}
