public class Animal {
    private String name;
    private final String color;
    private int legsCount;
    private boolean fly;
    private boolean toGo;
    private boolean swim;


    public Animal(String name, String color, int legsCount, boolean fly, boolean toGo, boolean swim) {
        this.name = name;
        this.color = color;
        this.legsCount = legsCount;
        this.fly = fly;
        this.toGo = toGo;
        this.swim = swim;
    }


    // todo: Ниже методы, отвечающие за состояние объекта.
    //  !!!Обратите внимание на разные способы вывода строк в sysout java

//    public void wakeUp() {
//        System.out.println(getType() + ": проснулся");
//    }
//
//    public void findFood() {
//        String out = String.format("%s: нашел еду%n", getType());
//        System.out.println(out);
//    }
//
//    public void eat() {
//        System.out.printf("%s: поел%n", getType());
//    }
//
//    public void toPlay() {
//        System.out.printf("%s: поиграл%n", getType());
//    }
//
//    public void goToSleep() {
//        System.out.printf("%s: уснул%n", getType());
//    }

    public void speak() {
        System.out.printf("%s: ...%n", getType());
    }

    public void action() {
        fly();
        swim();
        toGo();

    }

    public void toGo() {
        if (isToGo() == true) {
            System.out.printf("%s-бегает\n", getName());
        } else {
            System.out.printf("%s-не бегает\n", getName());
        }

    }

    public void fly() {
        if (isFly() == true) {
            System.out.printf("%s-летет\n", getName());
        } else {
            System.out.printf("%s-не летает\n",getName());
        }

    }

    public void swim() {
        if (isSwim() == true) {
            System.out.printf("%s-плывет\n", getName());
        } else {
            System.out.printf("%s-не плавает\n", getName());
        }
    }

    public void hunt() {
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

    public boolean isFly() {
        return fly;
    }

    public boolean isToGo() {
        return toGo;
    }

    public boolean isSwim() {
        return swim;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
