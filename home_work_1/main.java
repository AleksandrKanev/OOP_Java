
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal vaska = new Cat("Васька", "серый");

        System.out.println(vaska);
        System.out.println(vaska.getType());

        vaska.speak();
        Duck duck = new Duck("пёстрый", "коричневый");
        System.out.println(duck);
        Dog dog = new Dog("Шарик", "рыжий");
        Eagle eagle = new Eagle("Орел");
        Shark shark = new Shark("Акула");

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(new Fish("Немо"));
        animals.add(new Raven("Ворон"));
        animals.add(shark);
        animals.add(eagle);
        animals.add(duck);
        animals.add(dog);
        animals.forEach(Animal::speak);
//        System.out.println("--------летчики------------");

        for (Animal a : animals) {
            a.action();
        }
//         System.out.println("--------охота------------");

        vaska.hunt();

    }
}
