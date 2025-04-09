package org.example.java324.sort.sort3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {
    static class Car {
        public String brand;
        public String model;
        public int year;

        public Car(String b, String m, int y) {
            brand = b;
            model = m;
            year = y;
        }
    }

    // Create a comparator
    static class SortByYear implements Comparator {
        public int compare(Object obj1, Object obj2) {
            // Make sure that the objects are Car objects
            Car a = (Car) obj1;
            Car b = (Car) obj2;

            // Compare Integer
            if (a.year < b.year) return -1; // The first car has a smaller year
            if (a.year > b.year) return 1;  // The first car has a larger year
            return 0;

            // Compare string
//            return a.model.compareTo(b.model);
        }
    }

    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "Accord", 1999));
        myCars.add(new Car("Honda", "X2", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Use a comparator to sort the cars
//        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, new SortByYear());

        // Display the cars
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }

}
