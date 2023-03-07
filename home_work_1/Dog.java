public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color, 4, false,true,false);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Гав!%n", getType());
    }

//    @Override
//    public void action() {
//        System.out.printf("%s-побежал", getType());
//    }
}
