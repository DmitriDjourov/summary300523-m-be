package de.telran.lesson20230922;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExamples {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jenny");
        names.add("Mary");
        names.add("Jack");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String current = iterator.next();
            System.out.println(current);
            if (current.equals("Mary")) iterator.remove();
        }

        System.out.println("After remove operation:");
        iterator = names.iterator();
        while (iterator.hasNext()){
            String current = iterator.next();
            System.out.println(current);
        }

        for (String s : names) {
            System.out.println(s);
        }


    }



}
