package com.github.javafundamental.basic.collection;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class CollectionList {
    public static void main(String[] args) {
        String[] heroes =  new String[3];
        heroes[0] = "riki";
        heroes[1] = "Invoker";
        heroes[2] = "zeus";
        System.out.println(heroes[1]);

        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planet awal: ");
        for(int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+ i + " = "+ planets.get(i));
        }
        planets.remove(1);
        for(int i = 0; i < planets.size(); i++){
            System.out.println("\t index-"+ i + " = "+ planets.get(i));
        }
    }
}
