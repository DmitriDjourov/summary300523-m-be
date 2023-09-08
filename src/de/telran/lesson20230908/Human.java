package de.telran.lesson20230908;

public class Human implements Playable {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Human " + name + " plays");
    }

    @Override
    public void play(Playable playable) {
        System.out.println("Human " + name + " plays with " + playable);
    }
}
