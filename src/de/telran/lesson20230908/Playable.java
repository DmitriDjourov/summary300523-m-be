package de.telran.lesson20230908;

public interface Playable {

    public static final int number = 10;
    int n2 = 10;

    void play();

    void play(Playable playable);


    static void method() {
//        this.play();
        System.out.println("Static method " + number);
    }

    default void defaultMethod() {
        System.out.println("Default method");
        this.play();
    }

}
