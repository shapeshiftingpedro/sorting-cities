package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2){
         double i = o2.getArea()-o1.getArea();
        if (i > 0) {return 1;
        }else if (i < 0) {return -1;
    }else {return 0;}
}
}
