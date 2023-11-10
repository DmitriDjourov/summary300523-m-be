package de.telran.lesson20231110;

public class UseSteams {

    public static void main(String[] args) {
        MyStream<String> myStream = new MyStream<>();

        MyStream<String> filtered = myStream.filter(s -> s.length() == 3).parallel().filter(s -> s == "A");


    }


}
