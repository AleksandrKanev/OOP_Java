package home_work_2.supe;

public abstract class Animal {
    private String name;
    private final String color;
    private int legsCount;



    public Animal(String name, String color, int legsCount) {
        this.name = name;
        this.color = color;
        this.legsCount = legsCount;

    }




    //todo: Ниже геттеры и сеттеры. !!! Обратите внимание, не к каждому полю есть сеттер(один из шагов инкапсуляции)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }


    public String getType() {
        return this.getClass().getSimpleName();
    }
}
