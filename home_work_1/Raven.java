public class Raven extends Animal{
    public Raven(String name,String color) {
        super(name, color, 2, true, false, false);
    }
    public Raven(String name) {
        this(name, "черный");
    }
}
