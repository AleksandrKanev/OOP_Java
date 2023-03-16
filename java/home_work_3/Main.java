package home_work_3;

import home_work_3.drugs.Component;
import home_work_3.drugs.impl.CatDrug;
import home_work_3.drugs.impl.components.Azitron;
import home_work_3.drugs.impl.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatDrug componentsCat = new CatDrug();
        componentsCat.addComponents(new Azitron("Азитрон", "2", 4));
        componentsCat.addComponents(new Azitron("Азитрон", "2", 4));



        for (Component component : componentsCat) {
            System.out.println(component);
        }
        CatDrug drug1  = new CatDrug();
        drug1.addComponents(new Water("Вода", "20", 5));
        drug1.addComponents(new Azitron("Азитрон", "10", 5));
        CatDrug drug2 = new CatDrug();
        drug2.addComponents(new Water("Вода", "20", 11));
        drug2.addComponents(new Azitron("Азитрон", "10", 9));
        CatDrug drug4 = new CatDrug();
        drug4.addComponents(new Water("Артезианска вода", "20", 1));
        drug4.addComponents(new Azitron("Азитрон", "10", 9));

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug4);
        System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);
    }
}
