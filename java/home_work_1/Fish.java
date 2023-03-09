public class Fish extends Animal{
    public Fish(String name,String color) {
        super(name, color, 0, false, false, true);
    }
    public Fish(String name) {
        this(name, "белая");
    }

}
