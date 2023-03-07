public class Shark extends Animal {
    public Shark(String name,String color) {
        super(name, color, 0, false, false, true);
    }
    public Shark(String name) {
        this(name, "белая");
    }
}
