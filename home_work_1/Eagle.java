public class Eagle extends Animal {
    public Eagle(String name,String color) {
        super(name, color, 2, true, false, false);
    }
    public Eagle(String name) {
        this(name, "черный");
    }
}
