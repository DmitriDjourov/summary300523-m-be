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
        List<BMW> bmws = new ArrayList<>();










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
