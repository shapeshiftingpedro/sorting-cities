package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);

        printCities(cities);

        StateComparator comparator1 = new StateComparator();
        cities.sort(comparator1);

        printCities(cities);

        PopulationComparator comparator2 = new PopulationComparator();
        cities.sort(comparator2);

        printCities(cities);


        AreaComparator comparator3 = new AreaComparator();
        cities.sort(comparator3);

        printCities(cities);
    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
