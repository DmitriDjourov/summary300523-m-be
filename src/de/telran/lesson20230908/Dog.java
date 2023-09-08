package de.telran.lesson20230908;

public class Dog extends Animal {

    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void bark(){
        System.out.println("Gav-gav!!!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void sayHello() {
        System.out.println("Gav-gav!");
    }

    @Override
    public void play(Playable playable) {
        System.out.println("Dog plays with " + playable);
    }
}
