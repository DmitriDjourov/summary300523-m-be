package de.telran.lesson20230922;

import java.util.Iterator;

public class MyCustomArrayList implements Iterable<String>{

    private String[] data;

    public MyCustomArrayList(String[] data) {
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false; // TODO
            }

            @Override
            public String next() {
                return null; // TODO
            }
        };
    }
}
