package de.telran.lesson20231110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class GenericExamples {

    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3);
        method(list);


        List<Integer> integerData = Arrays.asList(10, 20);
        List<Double> doubleData = Arrays.asList(10.0, 20.0);
        List<? extends Number> data1;
        data1 = integerData;
        data1 = doubleData;
        processNumber(integerData);
        processNumber(doubleData);

        List<? super Number> data2;
        List<Number> data3;


        // PECS = Producer Extends Consumer Super

        // PECS = Producer Extends
        List<BMW> bmws = new ArrayList<>();
        List<Volwo> volwos = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        List<WhiteBMW> whiteBMWs = new ArrayList<>();

        List<? extends Car> carsInShop = bmws;
        carsInShop = volwos;
        carsInShop = cars;
        carsInShop = whiteBMWs;

//        carsInShop.add(new BMW());
//        carsInShop.add(new Volwo());
//        carsInShop.add(new Car());

        Car car = carsInShop.get(0); // Producer


        // Consumer Super
        List<? super Car> carsOnTheParking = new ArrayList<>();
        carsOnTheParking.add(new Car()); // Consumer
        carsOnTheParking.add(new BMW());
        carsOnTheParking.add(new Volwo());
//        carsOnTheParking.add(new Object());

        Object o = carsOnTheParking.get(0);

        List<? super BMW> carsList = new ArrayList<>();
        carsList = new ArrayList<BMW>();
        carsList = new ArrayList<Car>();
        carsList = new ArrayList<Object>();
//        carsList = new ArrayList<Volwo>();
//        carsList = new ArrayList<WhiteBMW>();

        carsList.add(new BMW());
        carsList.add(new WhiteBMW());
//        carsList.add(new Car());
    }

    public static void processNumber(List<? extends Number> data) {
    }


    // type erasure
    public static void method(List<String> strings) {

    }

//    public static void method(List<Integer> integers) {
//
//    }

}
