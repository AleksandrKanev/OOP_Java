package home_work_3.drugs;

//import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    @Override
    public int compareTo(Drug o) {
        if (this.getDrugPower() == o.getDrugPower())
            return this.getLenName().compareTo(o.getLenName());
        else if (this.getDrugPower() < o.getDrugPower())
            return -1;
        else
            return 1;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }
            public Component next() {
                return components.get(index++);
            }
        };
    }
    private List<Component> components;
    int index;

    public Drug() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public int getDrugPower(){
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    }

    public String getLenName(){
        String lenNam = "";
        for (Component component: components) {
            lenNam += component.getName();
        }
        return lenNam;
    }
    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }
    public void addComponents(Component component) {
        if (!(components.indexOf(component) != -1))
            components.add(component);
    }

}
