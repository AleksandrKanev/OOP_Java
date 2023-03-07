public class Duck extends Animal {
    public Duck(String name,String color) {
        super(name, color, 2, true,false,true);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Кря!%n", getType());
    }

//    @Override
//    public void action() {
//        System.out.printf("%s-полетел", getType());
//    }

}
