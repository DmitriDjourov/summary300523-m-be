package de.telran.lesson20231215;

import java.util.List;

public class WorldApp {

    public static void main(String[] args) {
        CityDAO cityDAO = new CityDAO();

//        City city = new City(0, "New city", "USA", "Massachusetts", 12312);
//        cityDAO.save(city);

        List<City> cities = cityDAO.getAll();
        cities.forEach(System.out::println);

        System.out.println("Cities in the USA with population > 1_000_000:");
        cities = cityDAO.getCityByCountryAndPopulation("USA", 1_000_000);
        cities.forEach(System.out::println);

        System.out.println("Get by id: " + 4079 + " : " + cityDAO.get(4079));
//        cityDAO.delete(4079);
    }


}
